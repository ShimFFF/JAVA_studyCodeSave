package Ex13_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex13_9 {
	 public static void main(String[] args) {
	        try {
	            String fileName = "haberman.data";   // Specify the input CSV file name

	            // Open the input file for reading
	            BufferedReader reader = new BufferedReader(new FileReader(fileName));

	            int numSurvived = 0;
	            int numDied = 0;
	            int totalNodesSurvived = 0;
	            int totalNodesDied = 0;

	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] fields = line.split(",");

	                if (fields.length >= 4) {
	                    int nodes = Integer.parseInt(fields[2].trim());
	                    int survivalStatus = Integer.parseInt(fields[3].trim());

	                    if (survivalStatus == 1) {
	                        numSurvived++;
	                        totalNodesSurvived += nodes;
	                    } else if (survivalStatus == 2) {
	                        numDied++;
	                        totalNodesDied += nodes;
	                    }
	                }
	            }

	            reader.close();

	            double avgNodesSurvived = numSurvived > 0 ? (double) totalNodesSurvived / numSurvived : 0;
	            double avgNodesDied = numDied > 0 ? (double) totalNodesDied / numDied : 0;

	            System.out.println("Average number of positive axillary nodes for patients who survived 5 years or longer: " + avgNodesSurvived);
	            System.out.println("Average number of positive axillary nodes for patients who died within 5 years: " + avgNodesDied);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
