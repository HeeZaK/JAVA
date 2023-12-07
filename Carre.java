import java.util.Scanner;

public class Carre {
    public static void main(String[] args) {
        int taille1;
        int taille2;
        int taille3 = 5;
        Scanner scan = new Scanner(System.in);
        System.out.print("quelle taille pour votre forme : ");
        taille1 = scan.nextInt();
        System.out.print("quelle largeur pour votre forme : ");
        taille2 = scan.nextInt();
        System.out.print("quelle forme ? 1 pour rectangle, 2 pour triangle, 3 pour sapin : ");
        int forme = scan.nextInt();
        switch (forme) {
            case 1:
                carre(taille1, taille2);
            case 2:
                triangle(taille1, taille2);
            case 3:
                etoile(taille3, taille2);
                triangle(taille1, taille2);
                carre(taille1, taille2);
        }
    }

    public static int carre(int taille1, int taille2) {

        for (int i = 0; i < taille1/2; i++) {
            for (int j = 0; j < taille2/1.5; j++) {
                System.out.print(" ");
            }for (int j = 0; j < taille2/2; j++) {
                System.out.print("\u001B[33m*\u001B[0m");
            }
            System.out.println();
        }
        return taille1;
    }

    public static int triangle(int taille1, int taille2) {
        for (int i = 0; i < taille1; i++) {
            for (int j = i; j < taille2 - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("\u001B[32m*\u001B[0m");
            }
            System.out.println();
        }
        return taille1;
    }

    public static int etoile(int taille1, int taille2) {
        for (int i = 0; i < taille1; i++) {
            for (int j = i; j < taille2 - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("\u001B[36m*\u001B[0m");
            }
            System.out.println();
        }
        return taille1;
    }
}