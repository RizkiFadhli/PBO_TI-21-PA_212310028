
public class Latihan02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,f;
		float r,k;
		c = 90;
		
		CelciusToFahrenheit();
		r=CelciusToRheamur();
		k=CelciusToKelvin();
		System.out.println("Convert Celcius to Kelvin");
		System.out.println("k = " + k);
		System.out.println("Convert Celcius to rheamur");
		System.out.println("r = " + r);
	}

	static void CelciusToFahrenheit() {
		int c = 90;
		int f = ((c * 9/5) + 32 );
		System.out.println("Convert CelciusToFahrenheit");
		System.out.println("c = " +c);
		System.out.println("f = " +f);
	}

	static float CelciusToRheamur( ) {
		int c = 90;
		int r=(5/4 * c);
		return r;
	}
	
	static int CelciusToKelvin( ) {
		int c = 90;
		float k = (float) (c + 273.3); 
		return (int) k;
	}
	
	

}
