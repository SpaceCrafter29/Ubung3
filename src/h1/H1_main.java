package h1;

public class H1_main {
    public static void main(String[] args) {
        double guthaben = -100;
        double monEingang = 100;
        int rating = 0;
        boolean warnhinweis = false;
        boolean negativ = false;
        if (guthaben > 0){
            negativ = false;
            rating += 3;
        }
        else{
            negativ = true;
            if (guthaben == 0){
                rating += 2;
            }
            else if(guthaben + monEingang >= 0){
                rating += 1;
            }
            else{
                rating -= 1;
            }
        }
        if (negativ && !((guthaben + monEingang) > 0) && rating < 0){
            warnhinweis = true;
        }
        else{
            warnhinweis = false;
        }
        System.out.println("Guthaben: " + guthaben);
        System.out.println("Mon Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Warnhinweis: " + warnhinweis);
        System.out.println("Negativ: " + negativ);
    }
}
