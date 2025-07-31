package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.InventoryService;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.Order;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderRepository;
import mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Mock
    private InventoryService inventoryService;

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @Test
    public void testGoodProcessOrder() {
        Order order = new Order("productLol",2,3 );

        when(inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())).thenReturn(true);

        Assertions.assertTrue(orderService.processOrder(order));

        verify(inventoryService, times(1)).isProductAvailable(order.getProductId(), order.getQuantity());
        verify(orderRepository, times(1)).saveOrder(order);
    }

    @Test
    public void testBadProcessOrder() {
        Order order = new Order("badProduct", 10, 100);

        when(inventoryService.isProductAvailable(order.getProductId(), order.getQuantity())).thenReturn(false);

        Assertions.assertFalse(orderService.processOrder(order));

        verify(inventoryService, times(1)).isProductAvailable(order.getProductId(), order.getQuantity());
        verify(orderRepository, times(0)).saveOrder(order);
    }
}
