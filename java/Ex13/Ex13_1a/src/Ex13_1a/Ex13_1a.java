package Ex13_1a;
/*Get a file name from the user, and create a text file
 Generate 10 random integers and store in the file
 Close and re-open the file: read all numbers and compute 
	their min, max, sum, and average
*/

import java.io.*;
import java.util.Random;

public class Ex13_1a {
	public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter the file name: ");
            String fileName = reader.readLine();

            // Create a new text file
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);

            // Generate and write 10 random integers to the file
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + "\n");
            }

            writer.close();

            // Re-open the file for reading
            BufferedReader fileReader = new BufferedReader(new FileReader(file));

            // Compute statistics
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            int count = 0;
            String line;

            while ((line = fileReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                min = Math.min(min, number);
                max = Math.max(max, number);
                sum += number;
                count++;
            }

            double average = (double) sum / count;

            fileReader.close();

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
