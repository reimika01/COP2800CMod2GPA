// File: PalmerPenguinsM3.java
// Name: Tamieka Reid
// Submission Date: 9/20/2026
// Description: Palmer Penguin statistics using branching and switch logic

public class PalmerPenguinsM3 {

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

        // Branching analysis
        System.out.println();
        System.out.println("Branching Analysis:");

        if (NUM_CHINSTRAP > NUM_GENTOO
                && NUM_CHINSTRAP > NUM_ADELIE) {

            System.out.println(
                    SP_CHINSTRAP + " penguins are the most populous.");
        }
        else if (NUM_GENTOO > NUM_CHINSTRAP
                && NUM_GENTOO > NUM_ADELIE) {

            System.out.println(
                    SP_GENTOO + " penguins are the most populous.");
        }
        else if (NUM_ADELIE > NUM_CHINSTRAP
                && NUM_ADELIE > NUM_GENTOO) {

            System.out.println(
                    SP_ADELIE + " penguins are the most populous.");
        }
        else {
            System.out.println(
                    "There is a tie between species for the most populous.");
        }

        // Switch statement analysis
        String chosenSpecies = SP_GENTOO;

        System.out.println();
        System.out.println(
                "Individual Species Switch Statement Analysis:");

        switch (chosenSpecies) {

            case SP_CHINSTRAP:
                System.out.printf("%s: %d (%.2f%%)%n",
                        SP_CHINSTRAP,
                        NUM_CHINSTRAP,
                        (double) NUM_CHINSTRAP
                        / totalPenguins * 100);
                break;

            case SP_GENTOO:
                System.out.printf("%s: %d (%.2f%%)%n",
                        SP_GENTOO,
                        NUM_GENTOO,
                        (double) NUM_GENTOO
                        / totalPenguins * 100);
                break;

            case SP_ADELIE:
                System.out.printf("%s: %d (%.2f%%)%n",
                        SP_ADELIE,
                        NUM_ADELIE,
                        (double) NUM_ADELIE
                        / totalPenguins * 100);
                break;

            default:
                System.out.println("Species not recognized.");
        }
    }
}