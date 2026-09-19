// File: PalmerPenguinsM2.java
// Name: Tamieka Reid
// Submission Date: 9/13/2026
//Description: Program to calculate and display Palmer Penguin statistics

public class PalmerPenguinsM2 {

    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";

    static final int NUM_CHINSTRAP = 68;
    static final int NUM_GENTOO = 123;
    static final int NUM_ADELIE = 151;

    public static void main(String[] args) {

        int totalPenguins = NUM_CHINSTRAP
                + NUM_GENTOO
                + NUM_ADELIE;

        System.out.println("Introducing the Palmer Penguins:");
        System.out.println("   " + SP_CHINSTRAP + "!");
        System.out.println("   " + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("   " + SP_ADELIE + "!");

        System.out.println(
                "There are a total of 3 penguin species in this dataset.");

        System.out.println(
                "There are a total of " + totalPenguins
                + " penguins in the dataset.");

        System.out.printf("%s: %d (%.2f%%)%n",
                SP_CHINSTRAP,
                NUM_CHINSTRAP,
                (double) NUM_CHINSTRAP / totalPenguins * 100);

        System.out.printf("%s: %d (%.2f%%)%n",
                SP_GENTOO,
                NUM_GENTOO,
                (double) NUM_GENTOO / totalPenguins * 100);

        System.out.printf("%s: %d (%.2f%%)%n",
                SP_ADELIE,
                NUM_ADELIE,
                (double) NUM_ADELIE / totalPenguins * 100);
    }
}
