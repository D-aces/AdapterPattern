package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener{
	private PremiumGarageDoorOpener premiumGarageDoorOpener;
	private int speed;
	
	public GarageDoorAdapter(int speed) {
		premiumGarageDoorOpener = new PremiumGarageDoorOpener();
		this.speed = speed;
	}
	
	public void openDoor() {
		premiumGarageDoorOpener.openDoor(speed);
	}

	public void closeDoor() {
		premiumGarageDoorOpener.closeDoor(speed);
	}
}
