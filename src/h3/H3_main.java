package h3;

public class H3_main {
    public static void main(String[] args) {
        int max = 8000;
        int fix = 7832;
        int wartend = 450;
        boolean istVoll;
        int freiePlatze = max - fix;
        if (freiePlatze == 0){
            istVoll = true;
        }
        else {
            istVoll = false;
            wartend = wartend - freiePlatze;
            fix = max;
            istVoll = true;
        }
        if(wartend < 0){
            wartend = 0;
        }
        System.out.println("Belegte Plätze: " + fix + " von " + max);
        System.out.println("Personen auf der Warteliste: " + wartend);
        System.out.println("Stadion Voll? " + istVoll);
    }
}
