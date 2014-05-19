import java.util.Scanner;
public class Dice3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);	
		
		int number;
		
		Dice3 myRandomNumber = new Dice3();
		
		 System.out.printf("Please enter a number that you want to bounce \n");
		 number = input.nextInt();  
		
		// System.out.printf("Your Number is \n" + number);
		
		 int jorge=myRandomNumber.Throw( number); 	
		
		 
		 System.out.println(+ jorge);
 
   }	 
}	
