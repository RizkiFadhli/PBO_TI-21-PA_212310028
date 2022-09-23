import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Latihan04 {
	
	public static void main(String[] args) {
        System.out.println("===================================");
		System.out.println("\tTOKO SERBAGUNA IBIK");
		System.out.print("===================================\n");
		System.out.print("Masukkan jumlah produk yang dibeli : ");
		
		float Harga_roti=(float)6300, Total_harga, Diskon, Harga_akhir; 
		int Jumlah;
		
		    Scanner masukan = new Scanner(System.in);  
		    LocalDateTime Waktu_Sekarang = LocalDateTime.now();
		    DateTimeFormatter PolaWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy (HH:mm)");
		    String formatedDate = Waktu_Sekarang.format(PolaWaktu);
		    
		   	Jumlah = masukan.nextInt();
		   	Total_harga = Jumlah * Harga_roti;
		   	System.out.print("\n");
		  
	        System.out.println(formatedDate);
	        System.out.println("ITEM \t\tQTY \t\tHARGA \t\tTOTAL");
	        System.out.println("===========================================================");

	        System.out.println("ROTI ENAK. \t" + Jumlah + "\t\tRp " + Harga_roti + "\tRp " + Total_harga);
	        System.out.println("------------------------------------------------------------");
	        
		        if(Jumlah % 3 == 0) {
		            Diskon = (float) (0.05 * Total_harga);
		            Harga_akhir = Total_harga - Diskon;
		            System.out.println("Diskon: 5%");
		        } else {
		            Diskon = (float) (0.1 * Total_harga);
		            Harga_akhir = Total_harga - Diskon;
		            System.out.println("Diskon: 10%");
		        }

	        System.out.println("Sub Total = Rp " + Harga_akhir);
	    }

		  }
		
	

