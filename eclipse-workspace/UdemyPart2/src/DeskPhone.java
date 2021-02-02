
public class DeskPhone implements ITelephone {
	
	private int myNumber;
	private boolean isRinging;
	
	
	
	public DeskPhone(int myNumber, boolean isRinging) {
		
		this.myNumber = myNumber;
		this.isRinging = isRinging;
	}
	@Override
	public void powerOn() {
		System.out.println("No action take");
		
	}
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + "on dekphone");
		
	}
	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Asnwer the phone");
			isRinging = false;
		}
		
	}
	@Override
	public boolean callPhone(int phoneNumber) {
		
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("ring");
		}else {
		isRinging = false;
	}
		return isRinging;
	}
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
