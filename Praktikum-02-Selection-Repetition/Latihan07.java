import java.util.Scanner;

class Resto {
	private long harga;
	
	public void chooseMenu() {
		Scanner input = new Scanner(System.in);
		String pilih;
		int PilihMenu;
		
			while(true) {
			System.out.println("====PROGRAM PILIH MENU SARAPAN====\n");
			System.out.println("Menu Sarapan:");
			System.out.println("1. Nasi Goreng \n2. Bubur Ayam \n3. Soto Ayam ");
			System.out.print("Pilihan : ");
			PilihMenu = input.nextInt();
			
			getPrices(PilihMenu);
			
			System.out.print("\nApakah Anda ingin memesan lagi? [Y/N] : ");
			pilih = input.next();
			
			if(pilih.equalsIgnoreCase("Y")) {
				continue;
			} else if(pilih.equalsIgnoreCase("N")) {
				System.out.println("Terima kasih telah memesan");
				break;
			} else {
				System.out.println("Pilihan yang Anda masukkan salah!");
			}
		}
		input.close();
	}
	
	private long getPrices(int pilih) {
		switch(pilih) {
			case 1:
				harga = 22000;
				System.out.println("Harga Nasi Goreng = Rp " + harga);
			break;
			case 2:
				harga = 15000;
				System.out.println("Harga Bubur Ayam = Rp " + harga);
			break;
			case 3:
				harga = 25000;
				System.out.println("Harga Soto Ayam = Rp " + harga);
			break;
			default:
				System.out.println("Pilihan tidak ada");
		}		
		return pilih;
	}
}

public class Latihan07 {
	
	public static void main(String[] args)  {
		Resto restoran = new Resto();
		
		restoran.chooseMenu();		
	}

}