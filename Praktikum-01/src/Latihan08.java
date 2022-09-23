import java.util.Scanner;


public class Latihan08 {
	public static void main(String[] args) {
		int NPM,semester;

		String Nama_Lengkap, Nama_Kelas;
		double IPK ;
		
		Scanner Input = new Scanner (System.in);
		
		System.out.print("NPM : ");
		NPM = Input.nextInt();
		
		System.out.print("Nama Lengkap : ");
		Nama_Lengkap = Input.nextLine();

                Input.nextLine();
		
		System.out.print("Nama Kelas : ");
		Nama_Kelas = Input.nextLine();
		
		System.out.print("Semester : ");
		semester = Input.nextInt();
		
		System.out.print("IPK : ");
		IPK = Input.nextDouble();
		
		System.out.println("NPM" +NPM);
		System.out.println("Nama Lengkap" +Nama_Lengkap);
		System.out.println("Nama Kelas" +Nama_Kelas);
		System.out.println("Semester : " +semester);
		System.out.println("IPK : " +IPK);
		
        }
}
