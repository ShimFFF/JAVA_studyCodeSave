package Ex13_1b;

/*Ex13_1b. Write a following program:
 Read a file containing people’s names
 Write each first & last names in a single line in a new file
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex13_1b {
	public static void main(String[] args) {
        try {
            String inputFileName = "input.txt";   // Specify the input file name
            String outputFileName = "output.txt"; // Specify the output file name

            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(" ");
                if (names.length >= 2) {
                    String firstName = names[0];
                    String lastName = names[1];
                    String fullName = firstName + " " + lastName;
                    writer.write(fullName);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            System.out.println("Names concatenated successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
