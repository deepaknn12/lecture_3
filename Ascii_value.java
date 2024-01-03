import java.util.Scanner;

public class Ascii_value {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int ans = str.charAt(0);
        System.out.println(ans);
        s.close();
    }
}
