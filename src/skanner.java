import java.util.Scanner;

public class skanner {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("username?");
			String username = input.nextLine(); 
			System.out.println("age?");
			Integer age = Integer.parseInt(input.nextLine());
			System.out.println("adress?");
			String adress = input.nextLine();
			System.out.println("postnummer?");
			String postnummer = input.nextLine();
			System.out.println("Stad?");
			String stad = input.nextLine();
			System.out.println("Telefonnummer?");
			String telefonnummer = input.nextLine();
			System.out.println("username; "+username);
			System.out.println("age; "+age);
			System.out.println("adress; "+adress);
			System.out.println("postnummer; "+postnummer);
			System.out.println("stad; "+stad);
			System.out.println("telefonnummer; "+telefonnummer);
			
			
	}
}
