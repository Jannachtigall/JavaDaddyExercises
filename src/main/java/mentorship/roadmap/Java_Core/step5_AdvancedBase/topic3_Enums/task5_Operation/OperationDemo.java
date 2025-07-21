package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task5_Operation;

public class OperationDemo {

    public static void main(String[] args) {
        Operation[] operations = Operation.values();
        for (Operation operation:
             operations) {
            System.out.println("Operation: " + operation.name() + ", result = " + operation.apply(6,5));
        }
    }
}
