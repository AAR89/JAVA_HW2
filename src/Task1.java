import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        Дано четное число N (>0) и символы c1 и c2.Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
        sumString();
    }

    private static void sumString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        System.out.print("Input c1: ");
        String c1 = in.next();
        System.out.print("Input c2: ");
        String c2 = in.next();
        in.close();
        for (int i = 0; i < n / 2; i++) {
            System.out.print(c1 + c2);
        }
    }
}