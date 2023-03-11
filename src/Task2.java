import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) throws Exception {
//        Создать файл с названием file.txt.
//        Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
        createFile();
        test();
    }

    public static void createFile() {
        try {
            File f = new File("file.txt");
            if (f.createNewFile()) {
                System.out.println("File created");
            } else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void test() throws Exception {

        FileWriter nFile = new FileWriter("file.txt");
        Scanner in = new Scanner(System.in);
        System.out.print("Input TEXT: ");
        String text = in.next();
        System.out.print("Input n: ");
        int n = in.nextInt();
        in.close();
        for (int i = 0; i < n; i++) {
            nFile.write("TEXT\n");
        }
        nFile.close();
    }
}


