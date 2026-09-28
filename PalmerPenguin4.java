// PalmerPenguinsM4.java
// Name: Tamieka Ried
// Date:09/27/2026
// Description: Reads the CSV file and counts each penguin species.

import java.util.Scanner;

public class PalmerPenguin4 {

    static final String FILE_NAME = "PalmerPenguins.csv";
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";

    public static void main(String[] args) {
        // TODO 1 Declare the variables
        int currRow = 0;
        int specChinStrapCount = 0;
        int specGentooCount = 0;
        int specAdelieCount = 0;

        try {
            // Read and display the header row.
            String line = CSVReader.readFile(FILE_NAME, currRow++);
            if (line == null) {
                System.out.println("Error: The CSV file is empty.");
                return;
            }
            System.out.println("found headers:");
            System.out.println(line);

            // Read each data row until the end of the file.
            while ((line = CSVReader.readFile(FILE_NAME, currRow++))
                    != null) {
                if (line.contains(SP_CHINSTRAP)) {
                    specChinStrapCount++;
                // TODO 2 complete the branches to increment the accumulators
                } else if (line.contains(SP_GENTOO)) {
                    specGentooCount++;
                } else if (line.contains(SP_ADELIE)) {
                    specAdelieCount++;
                }
            }

            // TODO 3 print all accumulators
            System.out.println("Chinstrap count = " + specChinStrapCount);
            System.out.println("Gentoo count = " + specGentooCount);
            System.out.println("Adelie count = " + specAdelieCount);
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Unable to open the CSV file at:");
            System.err.println(new java.io.File(FILE_NAME).getAbsolutePath());
            System.err.println(
                "Check that the CSV exists there and is readable.");
        }
    }
}

class CSVReader {

    public static String readFile(String fileName, int row)
            throws java.io.FileNotFoundException {
        try (Scanner fileInput = new Scanner(new java.io.File(fileName))) {
            int currentRow = 0;

            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                if (currentRow == row) {
                    return line;
                }
                currentRow++;
            }
        }
        return null;
    }
}