package week3.day2;

public class SmartPhone extends AndroidPhone {
	public void ConnectWhatsapp() {
		System.out.println("Whatsapp is connected");
		
	}

	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();
		obj.sendmsg();
		obj.ConnectWhatsapp();
		obj.savecontact();
		obj.Takevideo();
		obj.makeacall();
	

	}

}
