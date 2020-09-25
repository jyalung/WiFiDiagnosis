/**
 * This program allows the user see directions
 * when faced with internet connectivity
 * problem(s)
*/

import java.util.Scanner; //Allows the program to user scanners

public class WiFiDiagnosis {

	public static void main(String[] args) {
		Scanner response = new Scanner(System.in);
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work\n"); 
		System.out.println("Reboot your computer and try to connect");											  
		System.out.print("Are you able to connect with the internet? (yes or no) ");                              
		String yn = response.nextLine();
		
		while(!yn.equalsIgnoreCase("yes") && !yn.equalsIgnoreCase("no")) { //Loops the question until the user enters "yes" or "no"
			System.out.print("Are you able to connect with the internet? (yes or no) ");
			yn = response.nextLine();
		}
		
		if(yn.equalsIgnoreCase("yes")) { //tests out computer connectivity
			System.out.println("Rebooting your computer seemed to work");
		}
		else if(yn.equalsIgnoreCase("no")) {
			System.out.println("Reboot your router and try to connect");
			System.out.print("Are you able to connect with the internet? (yes or no) ");
			yn = response.nextLine();
			while(!yn.equalsIgnoreCase("yes") && !yn.equalsIgnoreCase("no")) {//Loops until user enters yes or no
				System.out.print("Are you able to connect with the internet? (yes or no) ");
				yn = response.nextLine();
			}
			
			if(yn.equalsIgnoreCase("yes")) { // tests router connectivity
				System.out.println("Rebooting your router seemed to work");
			}
			else if(yn.equalsIgnoreCase("no")) {
				System.out.println("Make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.print("Are you able to connect with the internet? (yes or no) ");
				yn = response.nextLine();
				while(!yn.equalsIgnoreCase("yes") && !yn.equalsIgnoreCase("no")) { //Loops until user enters yes or no
					System.out.print("Are you able to connect with the internet? (yes or no) ");
					yn = response.nextLine();
				}
				
				if(yn.equalsIgnoreCase("yes")) { // see if plugging in cable fixed problem
					System.out.println("Making sure the cables to your router are plugged in firmly seemed to work");
				}
				else if(yn.equalsIgnoreCase("no")) {
					System.out.println("Move your computer closer to your router");
					System.out.print("Are you able to connect with the internet? (yes or no) ");
					yn = response.nextLine();
					while(!yn.equalsIgnoreCase("yes") && !yn.equalsIgnoreCase("no")) {
						System.out.print("Are you able to connect with the internet? (yes or no) ");
						yn = response.nextLine();
					}
					
					if(yn.equalsIgnoreCase("yes")) {//see if moving computer fixed problem
						System.out.println("Moving your computer seemed to work");
					}
					else if(yn.equalsIgnoreCase("no")) {
						System.out.println("Contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");
					}
				}
			}
		}
		response.close();
	}

}
