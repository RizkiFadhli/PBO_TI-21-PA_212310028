
public class Latihan03  {
	
	public static void main(String[] args) {
		int luas, keliling;
		double d1,d2,a,c;

		luaslayang_layang();
		kelilinglayang_layang();
		prisma();
		
	 }

	 static double luaslayang_layang() {
		int d2 = 14;
		int d1 = 24;
		int luas = (int) (0.5 * d1 * d2);
		System.out.println("luas layang-layang = " + luas);
		return luas;
	 }
	 static double kelilinglayang_layang() {
		 double a = 14;
		 double c = 16;

		 double keliling = 2 * (a + c);
		 System.out.println("Keliling layang-layang =" +keliling);
		 return keliling; 
	 }
	 static void prisma() {
			int L;
			int la = 8;
			int t = 2;
			int a1 = 2;
			int a2 =3;
			int a3= 2;
			
			double V;
			int a = 6;
			int tp = 2;
			
			
			L = t*(a1+a2+a3) + (2*la);
			System.out.println("Luas Prisma Segitiga adalah= "+L);
		

		    V = (a*t/2) *tp;
		    System.out.println("Volume prisma segitiga adalah = "+V);
		}
}
