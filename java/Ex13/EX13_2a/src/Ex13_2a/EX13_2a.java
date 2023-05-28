package Ex13_2a;
/*Ex13_2a. Redo Ex13_1a.
 Generate 10 double values and store them in a binary file*/

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class EX13_2a {
	public static void main(String[] args) {
        try {
            String fileName = "doubles.bin"; // Specify the binary file name

            // Create a new binary file
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            // Generate and write 10 random double values to the binary file
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                double randomDouble = random.nextDouble();
                dataOutputStream.writeDouble(randomDouble);
            }

            dataOutputStream.close();

            System.out.println("Double values stored successfully in the binary file!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
