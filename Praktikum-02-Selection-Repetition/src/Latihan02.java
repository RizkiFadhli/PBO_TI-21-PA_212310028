import java.util.Scanner;
public class Latihan02 {

	public static void main(String[] args) {
		
	int angka;
	Scanner input = new Scanner(System.in);
	System.out.print("Masukkan Nomer NPM anda: ");
	angka = input.nextInt();
	{
		if(angka%2 == 1)
		{
			System.out.print(angka + " termasuk bilangan PRIMA ");
		}
		
		else if (angka%2 == 0)
		{
			System.out.println(angka + " Bukan termasuk bilangan prima karna dapat \r\n"
					+ "dibagi dengan 2");
		}
	}
  }    
}
