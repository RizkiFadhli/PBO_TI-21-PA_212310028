import java.util.Scanner;


public class Latihan03 {
	public static void main(String[] args) {
		
		int input;
		Scanner InputUser = new Scanner(System.in);
		
		System.out.println("Menu Sarapan: ");
		System.out.println();
		
		System.out.println("1. Nasi Goreng : ");
		System.out.println("2. Bubur Ayam : ");
		System.out.println("3. Soto Ayam : ");
		
		input = InputUser.nextInt();
		
		switch(input) {
		
		case 1 : 
			System.out.println("Anda memesan Nasi Goreng dengan harga Rp22.000,- \r\n"
					);
			break;
		
		
		case 2 :
			System.out.println("Anda memesan Bubur Ayam dengan harga Rp15.000,-\r\n"
					+ "”");
			break;
		
		case 3 :
			System.out.println("Anda memesan Soto Ayam dengan harga Rp25.000,-\r\n");
			break;
		
		default:
			System.out.println("Maaf menu yang anda \r\n"
					+ "masukan salah");
		}
	}
}
