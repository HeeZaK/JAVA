/**
 * Classe permettant de checker une date
 */
public class Exo5 {

    /**
     * programme principal
     * @param arg
     */
    public static void main (String [] arg){
    //appel de la méthode estbissextile de la classe util
        if(Util.estBissextile(2024)) {
            System.out.println("2024 est bissextile");
        } else
            System.out.println("2024 est non bissextile");
    }
}
