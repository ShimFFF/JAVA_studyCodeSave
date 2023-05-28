package Ex13_3;

/* The following is an old word puzzle: “Name a common word, besides 
tremendous, stupendous, and horrendous, that ends in dous.” If you 
think about this for a while it will probably come to you. However, we can 
also solve this puzzle by reading a text file of English words and outputting 
the word if it contains “dous” at the end. The text file “words.txt” contains 
87314 English words, including the word that completes the puzzle. This 
file is available online with the source code for the book. Write a program 
that reads each word from the text file and outputs only those containing 
“dous” at the end to solve the puzzle*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex13_3 {
	public static void main(String[] args) {
        try {
            String fileName = "words.txt";   // Specify the input file name

            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("dous")) {
                    System.out.println(line);
                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
