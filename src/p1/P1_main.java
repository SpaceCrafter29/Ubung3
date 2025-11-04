package p1;

public class P1_main {
    public static void main(String[] args) {
        byte wuerfel = 1;
        if (wuerfel == 2) {
            System.out.println("Leider Verloren");
        }
        if (wuerfel == 1 | wuerfel == 4) {
            System.out.println("Gewonnen!");
        }
        if (wuerfel == 5) {
            System.out.println("Unentschieden");
        }
    }
}
