public class FiboRecursif {
    public static void main (String[] args) {
        int x = 0;
        int y = 1;
        fiboRecur(x, y, 30);
    }
    public static int fiboRecur(int x, int y, int compteur) {
        int tmp = x + y;
        System.out.println(30 - compteur + " : " + x + " + " + y + " = " + tmp);
        if (compteur == 0) {
            return tmp;
        } else {
            return fiboRecur(y, tmp, compteur - 1);
        }
    }
}
