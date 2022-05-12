public class SimpleArray {
    public static void main(String[] args) {

        String [] tvSeries  = new String[6];
        tvSeries[0] = "Trapped";
        tvSeries[1] = "iZombie";
        tvSeries[2] = "Archive 81";
        tvSeries[3] = "Superstore";
        tvSeries[4] = "Grace and Frankie";
        tvSeries[5] = "Vikings";

        String favTvSeries = tvSeries[3];

        System.out.print("Mój ulubiony serial to: ");
        System.out.print(favTvSeries);
        System.out.println(".");

        int numberOfElements = tvSeries.length;
        System.out.print("Moja tablica zawiera ");
        System.out.print(numberOfElements);
        System.out.print(" elementów.");
    }
}