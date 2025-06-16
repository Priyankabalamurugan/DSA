package day08_main_projects;
import java.util.Scanner;
public class day08_main_project {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter something: ");
	        String userInput = scanner.nextLine();

	        try {
	            int intValue = Integer.parseInt(userInput);
	            System.out.println("Input is of type Integer");
	        } catch (NumberFormatException e1) {
	            try {
	                double doubleValue = Double.parseDouble(userInput);
	                System.out.println("Input is of type Double");
	            } catch (NumberFormatException e2) {
	                if (userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")) {
	                    System.out.println("Input is of type Boolean");
	                } else {
	                    System.out.println("Input is of type String");
	                }
	            }
	        }
	    }
	}


