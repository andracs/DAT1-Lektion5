package polse;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Bord bord1 = new Bord();

        bord1.materiale = "Træ";
        System.out.println("Bord1 er lavet af " + bord1.materiale);

        bord1.setAntalBordBen(10);
        System.out.println("Bord1 har " + bord1.getAntalBordBen() + " ben.");

    }
}
