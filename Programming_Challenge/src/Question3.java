import java.util.Scanner;

public class Question3 {
	
	/*
	 * This function will prompt the user to input a phone number using the scanner library.
	 * Once the phone number is retrieved from the user input it will check to see if the 
	 * number is the correct length. If it is not 10 digits the an error will be thrown, or
	 * if it is correct the number will be formatted correctly and printed.
	 */
	public static void phone_number_change() {
		Scanner scanObjPhone = new Scanner(System.in);
	    System.out.print("Enter Phone Number: ");
	    
	    //Retrieves phone number that the user typed
	    String phoneNum = scanObjPhone.nextLine();
	    
	    //Check the length of the number
		if(phoneNum.length() != 10) {
	    	System.out.println("Error Phone Numbers are 10 digits!");
	    }else {
	    	//Used regular expression to reformat the phone number.
	    	//Group the number into 3 parts, then format the numbers based on the second input of replaceFirst.
			phoneNum = phoneNum.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)$2-$3");
		    
		    System.out.println(phoneNum);
	    }
	}
	
	/*
	 * This function will prompt the user to input a social security number using the scanner library.
	 * Once the phone number is retrieved from the user input it will check to see if the 
	 * number is the correct length. If it is not 9 digits the an error will be thrown, or
	 * if it is correct the number will be formatted correctly and printed.
	 */
	public static void social_number_change() {
    	Scanner scanObjSocial = new Scanner(System.in);
	    System.out.print("Enter Social Security Number: ");
	    
	    //Retrieves social security number that the user typed
	    String socialNum = scanObjSocial.nextLine();
	    
	    //Check the length of the number
	    if(socialNum.length() != 9) {
	    	System.out.println("Error Social Security Numbers are 9 digits!");
	    }else {
	    	//Used regular expression to reformat the social security number
	    	//Group the number into 3 parts, then format the numbers based on the second input of replaceFirst.
		    socialNum = socialNum.replaceFirst("(\\d{3})(\\d{2})(\\d+)", "$1-$2-$3");
		    
		    System.out.println(socialNum);
	    }
	}
	
	
	
	
	 public static void main(String[] args) {
		//Initialize value string
	    String value = "S";
	    
	    //While value doesn't equal Q or quit keep prompting user for input
	    while(!value.equals("Q")) {
	    	System.out.println();
	    	
		    Scanner scanObj = new Scanner(System.in);
		    System.out.print("Enter 1 for Phone Number or 2 for Social Security Number: ");
		    
		    //Set value to the user input
		    value = scanObj.nextLine();
	    	
		    
	    	if(value.equals("1")) {
	    		phone_number_change(); //If value is 1 call the phone number change function
	    	}else if (value.equals("2")) {
	    		social_number_change(); //If value is 2 call the social number change function
	    	}else if (value.equals("Q")) {
	    		continue; //Continue to top of while if value is Q then end while loop
	    	}else {
	    		System.out.println("Error must enter 1 or 2!"); //If input is not one of above throw error
	    	}
	    
	    }
	    
	    
	 }
}
