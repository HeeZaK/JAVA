import java.util.Scanner;

public class factorRecursif {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisissez le factoriel :");
        int factor = scan.nextInt();
        System.out.println(factorRecur(factor));
    }
    public static int factorRecur(int factor) {
        if (factor == 1) {
            return factor;
        } else {
            return factor + factorRecur(factor - 1);
        }
    }
}
