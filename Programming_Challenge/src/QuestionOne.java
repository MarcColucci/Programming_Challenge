
import java.util.ArrayList;
import java.util.List;

public class QuestionOne {
	
	List<String> list_existing_names = new ArrayList<String>(); //List of Existing Names to compare against
	List<String> output_list = new ArrayList<String>(); //List of names that are going to be output
	
	
	/*
	 * This function will process the list of names being passed in and return a list of strings
	 * with the 3 letter names and IDs attached to those names. 
	 */
	public List<String> process_names(List<String> input_names) {
		
		//Loop through the list of names getting a single name at a time
		for (String name : input_names) {
			//Get the first 3 letters of the name
			name = name.substring(0, 3);
			int id = 0;
			String output_name = null;

			//Add the 3 letter name to existing names list
			list_existing_names.add(name);
			
			/*
			 * Loop through the existing names and check if the name passed in equals
			 * an existing name in the list. If the name is in the list increment by 5.
			 * If the same name is in the list multiple times it will increment by 5
			 * for how many times the name is in the existing name list.
			 */
			for (String existing_name : list_existing_names) {
				if (name.equals(existing_name)) {
					id += 5;
				}
			}
			
			
			//Format the output of the names with the id's attached.
			if (id < 10) {
				output_name = name + "00" + id;
			} else if (id >= 100) {
				output_name = name + id;
			} else {
				output_name = name + "0" + id;
			}
			
			//Add the formatted output name to the list
			output_list.add(output_name);
		}
		return output_list;
	}
	

	public static void main(String[] args) {
		
		//Created a list of strings with all the names we want to input.
		List<String> input_name_list = new ArrayList<String>(
				List.of("Jen","Jen","Tom","Vito","Jennifer","Vito"));
		
		//Created a class object, calls process names with the input name list
		QuestionOne obj = new QuestionOne();
		//Get the returned names + id's from the function
		List<String> output = obj.process_names(input_name_list);
		
		//Prints the returned values in a for loop
		for(String output_name : output) {
			System.out.println(output_name);
		}
	
	}

}
