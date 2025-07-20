package mentorship.roadmap.Java_Core.step2_Base.topic7_Methods.task1_AverageCalculator;

public class AverageCalculator {

    public static double getAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] doubles = new double[] {1, 2, 3, 4, 5, 6};
        System.out.println(getAverage(doubles));
    }
}
