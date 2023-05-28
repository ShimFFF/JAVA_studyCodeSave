package Ex13_2;

/*Write a program that reads a file of numbers of type int and writes all the 
numbers to another file, but without any duplicate numbers. Assume that 
the numbers in the input file are already ordered from smallest to largest. 
After the program is run, the new file will contain all the numbers in the 
original file, but no number will appear more than once in the file. The 
numbers in the output file should also be sorted from smallest to largest. 
Your program should obtain both file names from the user. Use either a 
text file or a binary file. For the text-file version, assume one number per 
line. For the binary-file version, use numbers of type int that are written 
using writeInt*/

import java.io.*;
import java.util.ArrayList;

public class Ex13_2 {
	 public static void main(String[] args) {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        try {
	            System.out.print("Enter the input file name: ");
	            String inputFileName = reader.readLine();

	            System.out.print("Enter the output file name: ");
	            String outputFileName = reader.readLine();

	            // Open the input file for reading
	            BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName));

	            // Read the numbers from the input file into an ArrayList while removing duplicates
	            ArrayList<Integer> numbersList = new ArrayList<>();
	            String line;
	            int previousNumber = Integer.MIN_VALUE;
	            while ((line = inputFileReader.readLine()) != null) {
	                int number = Integer.parseInt(line.trim());
	                if (number != previousNumber) {
	                    numbersList.add(number);
	                    previousNumber = number;
	                }
	            }
	            inputFileReader.close();

	            // Open the output file for writing
	            BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName));

	            // Write the unique numbers to the output file in sorted order
	            for (int number : numbersList) {
	                outputFileWriter.write(Integer.toString(number));
	                outputFileWriter.newLine();
	            }
	            outputFileWriter.close();

	            System.out.println("Unique numbers written to the output file successfully!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
