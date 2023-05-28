package Ex13_2b;

/*❑ Ex13_2b. Write a following program.
 Read a sequence of 10 positive integers d0, …, d9 
	from a text file ‘signal.txt’
 Difference δi between adjacent integers: -128 ≤ δi ≤ 127
 𝛿𝑖 = 𝑑𝑖 − 𝑑𝑖−1, 𝑖 = 1. . 9
 Write the first integer and nine differences (in byte type) d0, δ1, …, δ9to a binary file
 Read the binary file and then regenerate 
	the original sequence of integers d0, …, d9*/

import java.io.*;

public class Ex13_2b {
	public static void main(String[] args) {
        try {
            String inputFile = "signal.txt";     // Specify the input text file name
            String outputFile = "output.bin";   // Specify the output binary file name

            // Read the sequence of 10 positive integers from the text file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int[] integers = new int[10];
            for (int i = 0; i < 10; i++) {
                integers[i] = Integer.parseInt(reader.readLine());
            }
            reader.close();

            // Calculate the differences between adjacent integers
            byte[] differences = new byte[9];
            for (int i = 1; i < 10; i++) {
                int difference = integers[i] - integers[i - 1];
                differences[i - 1] = (byte) difference;
            }

            // Write the first integer and nine differences to the binary file
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(outputFile));
            dataOutputStream.writeInt(integers[0]);
            dataOutputStream.write(differences);
            dataOutputStream.close();

            System.out.println("Binary file created successfully!");

            // Read the binary file and regenerate the original sequence of integers
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(outputFile));
            int firstInteger = dataInputStream.readInt();
            byte[] regeneratedDifferences = new byte[9];
            dataInputStream.readFully(regeneratedDifferences);
            dataInputStream.close();

            int[] regeneratedIntegers = new int[10];
            regeneratedIntegers[0] = firstInteger;
            for (int i = 1; i < 10; i++) {
                regeneratedIntegers[i] = regeneratedIntegers[i - 1] + regeneratedDifferences[i - 1];
            }

            System.out.println("Regenerated sequence:");
            for (int i = 0; i < 10; i++) {
                System.out.println(regeneratedIntegers[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
