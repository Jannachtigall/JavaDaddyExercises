package mentorship.roadmap.Java_Core.step9_Test.topic2_Mockito.task1_OrderService.forTest;

public class Order {
    private String productId;
    private int quantity;
    private double pricePerUnit;

    public Order(String productId, int quantity, double pricePerUnit) {
        this.productId = productId;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double calculateTotalPrice() {
        return quantity * pricePerUnit;
    }
}
