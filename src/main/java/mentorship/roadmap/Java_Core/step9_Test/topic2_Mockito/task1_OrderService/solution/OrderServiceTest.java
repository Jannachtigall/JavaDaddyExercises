package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.InventoryService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.Order;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Mock
    private InventoryService inventoryService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order("prod123", 2, 50.0);
    }

    @Test
    void testOrderProcessingSuccess() {
        // Настраиваем поведение моков
        when(inventoryService.isProductAvailable("prod123", 2)).thenReturn(true);

        // Вызываем метод
        boolean result = orderService.processOrder(order);

        // Проверяем результат
        assertTrue(result);

        // Проверяем вызовы зависимостей
        verify(inventoryService, times(1)).isProductAvailable("prod123", 2);
        verify(orderRepository, times(1)).saveOrder(order);
    }

    @Test
    void testOrderProcessingFailure() {
        when(inventoryService.isProductAvailable("prod123", 2)).thenReturn(false);

        boolean result = orderService.processOrder(order);

        assertFalse(result);

        verify(inventoryService, times(1)).isProductAvailable("prod123", 2);
        verify(orderRepository, never()).saveOrder(order);
    }
}
