package p3;

public class P3_main {
    public static void main(String[] args) {
        //Aufgabe 1
        int betrag = 12;
        System.out.println("Betrag von " + betrag + " ist: "+ Math.abs(betrag));
        //Aufgabe 2
        int zahl1 = 21;
        System.out.println(zahl1 * zahl1);
        //Aufgabe 3
        int zahl2 = 21;
        if((zahl2 % 2) == 0){
            System.out.println(zahl2 + " ist gerade!" );
        }
        else {
            System.out.println(zahl2 + " ist ungerade!" );
        }

    }
}
