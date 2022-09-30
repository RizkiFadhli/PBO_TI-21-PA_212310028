import java.util.Scanner;

public class Latihan04 {
	public static void main(String[] args) {

		        int angka;
		        Scanner input = new Scanner(System.in);
		        System.out.print("Masukkan angka yang ingin dicari faktornya : ");
		        angka = input.nextInt();
		        System.out.print("Faktor dari " + angka + " adalah : ");
		        for(int x=1;x<=angka;x++)
		        {
		            if(angka%x == 0)
		            {
		                 System.out.print(x + " ");
		            }
		        }
	 }
}    
	

