package wifidiagnosis;


import java.util.Scanner;
public class wifidiagnosis {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work");
		System.out.println("Reboot the computer and try to connect");
		System.out.println("Did that fix the problem? (Yes or No)");
		
		String response = scan.nextLine();
		
		
		 
		
		while(!response.equals("Yes") && !response.equals("No") && !response.equals("yes") && !response.equals("no")  ) {  System.out.println("Invalid answer; try again");response = scan.nextLine();}
		
		if(response.equals("Yes")||response.equals("yes")) {System.out.println("Done");System.out.println("Programmer: Adam Sayyed"); }
		
		if(response.equals("No")||response.equals("no")) {System.out.println("Reboot the router and try to connect");
		System.out.println ("Did that fix the problem? (Yes or No)");
		
		
		
		
		
		
		
		
		
		
		
		String result = scan.nextLine();
		while(!result.equals("Yes") && !result.equals("No")&&!response.equals("yes") && !response.equals("no")  ) {  System.out.println("Invalid answer; try again");result = scan.nextLine();}
		if(result.equals("Yes")||result.equals("yes")) {System.out.println("Done");System.out.println("Programmer: Adam Sayyed");} 
		if(result.equals("No")||result.equals("no")) { System.out.println("Make sure the cables connecting the router are firmely plugged in and power is getting to the router ");
		System.out.println ("Did that fix the problem? (Yes or No)");
		
		
		
		
		
		String responses = scan.nextLine();
		while(!responses.equals("Yes") && !responses.equals("No")&& !response.equals("yes") && !response.equals("no")  ) {  System.out.println("Invalid answer; try again");responses = scan.nextLine();}
		if(responses.equals("Yes")||responses.equals("yes")) {System.out.println("Done");System.out.println("Programmer: Adam Sayyed");}
		if(responses.equals("No") || responses.equals("no")) {System.out.println("Contact your ISP");System.out.println("Done");System.out.println("Programmer: Adam Sayyed");}
		
		
		
		
		
		
		
		}
		
		
		
		}
		
		}
		
		
		 
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
 
