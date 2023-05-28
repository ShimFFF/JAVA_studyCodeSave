package Ex13_5;

/*. Text messaging is a popular means of communication. Many abbreviations 
are in common use but are not appropriate for formal communication. 
Suppose the abbreviations are stored, one to a line, in a text file named 
abbreviations.txt. For example, the file might contain these lines:
lol
:)
iirc
4
u
ttfn
Write a program that will read a message from another text file and 
surround each occurrence of an abbreviation with <> brackets. Write the 
marked message to a new text file.
For example, if the message to be scanned is
How are u today? Iirc, this is your first free day. Hope you are having 
fun! :)
the new text file should contain
How are <u> today? <Iirc>, this is your first free day. Hope you are 
having fun! <:)>*/


import java.io.*;

public class Ex13_5 {
	public static void main(String[] args) {
        try {
            String messageFileName = "message.txt";                     // Specify the input message file name
            String abbreviationsFileName = "abbreviations.txt";         // Specify the input abbreviations file name
            String markedMessageFileName = "marked_message.txt";        // Specify the output marked message file name

            // Read the abbreviations from the file
            BufferedReader abbreviationsReader = new BufferedReader(new FileReader(abbreviationsFileName));
            String abbreviation;
            String abbreviationsRegex = "";
            while ((abbreviation = abbreviationsReader.readLine()) != null) {
                abbreviationsRegex += "\\b" + abbreviation + "\\b|";
            }
            abbreviationsReader.close();

            abbreviationsRegex = abbreviationsRegex.substring(0, abbreviationsRegex.length() - 1);  // Remove the trailing "|"

            // Open the input message file for reading
            BufferedReader messageReader = new BufferedReader(new FileReader(messageFileName));

            // Create a StringBuilder to build the marked message
            StringBuilder markedMessage = new StringBuilder();

            String line;
            while ((line = messageReader.readLine()) != null) {
                markedMessage.append(markAbbreviations(line, abbreviationsRegex)).append(System.lineSeparator());
            }

            messageReader.close();

            // Write the marked message to the output file
            BufferedWriter markedMessageWriter = new BufferedWriter(new FileWriter(markedMessageFileName));
            markedMessageWriter.write(markedMessage.toString());
            markedMessageWriter.close();

            System.out.println("Marked message written to the file successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String markAbbreviations(String message, String abbreviationsRegex) {
        return message.replaceAll(abbreviationsRegex, "<$0>");
    }
}
