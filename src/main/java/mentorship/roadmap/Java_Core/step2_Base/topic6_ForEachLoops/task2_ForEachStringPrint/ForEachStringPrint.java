package mentorship.roadmap.Java_Core.step2_Base.topic6_ForEachLoops.task2_ForEachStringPrint;

public class ForEachStringPrint {

    public static void main(String[] args) {
        String[] strings = new String[] {"Привет", "Как дела?", "Как погода?", "Азаза"};

        for (String str:
             strings) {
            System.out.println(str);
        }
    }
}
