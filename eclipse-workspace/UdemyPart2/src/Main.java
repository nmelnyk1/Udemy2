
public class Main {

	public static void main(String[] args) {
	
		ITelephone timPhone;
		timPhone = new DeskPhone (5455656, false);
		
		timPhone.answer();
		timPhone.callPhone(45345345);
		timPhone.powerOn();
		

	}

}
