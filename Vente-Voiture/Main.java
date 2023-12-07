public class Main {
    public static void main(String[] args) {
        TableauVente myVentes = new TableauVente();

        System.out.println();
        myVentes.display_ventes();

        System.out.println();
        myVentes.edit_ventes();

        System.out.println();
        myVentes.nb_exemplaires();

        System.out.println();
        myVentes.ca_vendeur();
    }
}