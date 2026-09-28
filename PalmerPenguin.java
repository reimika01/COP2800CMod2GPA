// PalmerPenguins.java
// Tamieka Reid
// 9/8/2026
// Program to introduce the Palmer Penguin species

public class PalmerPenguin {

    // constants to represent the species and count
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";

    static final int TOTAL_SPECIES = 3;

    public static void main(String[] args) {

        // output the species names with introductory text
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES +
                " penguin species in this dataset.");
    }
}
