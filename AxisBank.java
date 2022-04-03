package week3.day2;

public class AxisBank {

	public void savingsaccount (){
		System.out.println("6%interest");
	}
	public void fixeddeposit() {	
		System.out.println("7%interest");
	}
    public void gst() {
    	System.out.println("5%gst");
    }
	public static void main(String[] args) {
		
		AxisBank obj=new AxisBank();
		obj.fixeddeposit();
		obj.savingsaccount();
		obj.gst();
	}

}
