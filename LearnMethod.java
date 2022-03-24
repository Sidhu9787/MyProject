package week1.day1;

public class LearnMethod {
	// method
	static short wheel=6;
	private int otp=1234567890;
	long regNum=123456789L;
	long regnum=32434;
	float num=1.23f;
	double accountBalance=34.233d;
	char status='p';
	String name="swift";
	
	
	public void driveCar() {
		System.out.println(wheel);
		System.out.println(otp);
		System.out.println(regnum);
		System.out.println(num);
		System.out.println("My Car");

	}

	public void gearCar() {
		System.out.println("GearCar");
		
		
	}

	// main method
	public static void main(String[] args) {
		short wheel = 4;
		int otp = 0123456;
		long number = 12356789L;
		LearnMethod car = new LearnMethod();
		car.driveCar();
		car.gearCar();
		System.out.println(wheel);

	}

}
