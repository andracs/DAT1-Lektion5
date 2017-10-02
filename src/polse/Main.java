package polse;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Bord bord1 = new Bord();
        Bord bord2 = new Bord();
        Bord bord3 = new Bord();

        bord1.setMateriale("Træ");
        System.out.println("Bord1 er lavet af " + bord1.getMateriale() + ".");

        bord2.setMateriale("Cold hard Steel, baby");
        System.out.println("Bord2 is made of " + bord2.getMateriale() + ".");

        bord3.setMateriale("Pure transparent Glass, darling");
        System.out.println("Bord3 is made of " + bord3.getMateriale() + ".");

        bord1.setAntalBordBen(10);
        System.out.println("Bord1 har " + bord1.getAntalBordBen() + " ben.");

    }
}
