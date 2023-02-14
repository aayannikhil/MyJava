import java.util.Scanner;

public class Fibb {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many till?");
        int ques = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        while (ques != 0) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            ques--;
        }
        sc.close();
    }
}
