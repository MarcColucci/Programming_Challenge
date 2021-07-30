import java.io.*;

public class QuestionTwo {
	
	/*
	 * Used comma as the delimiter as well as a regular expression. The regular expression is to
	 * make it so if commas are in between quotes it does not split on them. 
	 */
	public static final String delimiter = (",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
	
	/*
	 * This function takes in a csv file as a string and reads in the lines one by one
	 * printing the results on seperate lines.
	 */
	public static void read_file(String csv_file) {
		try {
			
	         File file = new File(csv_file);
	         FileReader fReader = new FileReader(file);
	         BufferedReader bReader = new BufferedReader(fReader);
	         
	         String line;
	         String[] tempAr;
	         int iteration = 0;
	         while((line = bReader.readLine()) != null) {
	        	 //Skip over first line of csv file
	        	 if(iteration == 0){
	        		 iteration++;
	        		 continue;
	        	 }
	            tempAr = line.split(delimiter);
	            for(String tempStr : tempAr) {
	            	//Replace all quotes in the string to empty string
	            	tempStr = tempStr.replaceAll("\"", "");
	            	//Print the string with a new line after every line
	            	System.out.print(tempStr + "\n");
	            }
	         }
	         
	         
	         bReader.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
		}
	
	public static void main(String[] args) {
	      String file = "D:/csv_file.csv";
	      
	      //Pass file to read to the read_file function
	      QuestionTwo.read_file(file);
	}
}
