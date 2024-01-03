import java.util.Scanner;

public class mulply_two_numbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long f1 = s.nextInt();
        long f2 = s.nextInt();
        long product = f1 * f2;
        System.out.println(product);
        s.close();
    }
}
