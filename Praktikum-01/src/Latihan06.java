import java.util.Scanner;

public class Latihan06 {
	public static void main(String[] args) {
		String Usia,Firstname, Lastname, NPM, concat;
		Scanner Input = new Scanner (System.in);

		
		System.out.println("Masukkan Usia, First name, Last Name dan NPM:");
		System.out.println("Usia : ");
		Usia = Input.nextLine();
		
		System.out.println("First name : ");
		Firstname = Input.nextLine();
		
		System.out.println("Last Name : ");
		Lastname = Input.nextLine();
		
		System.out.println("NPM : ");
		NPM = Input.nextLine();
		
		concat = Usia.concat(Firstname).concat(Lastname).concat(NPM);
		System.out.println("Output : "   + concat);
		
}
}
