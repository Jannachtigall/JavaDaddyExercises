package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic2_Exceptions.task3_FileNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("unexistedfile.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
