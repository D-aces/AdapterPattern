package SGDO;

public class GarageDoorAdapter implements StdGarageDoorOpener{
	private PremiumGarageDoorOpener premiumGarageDoorOpener;
	private int speed;
	
	public GarageDoorAdapter(PremiumGarageDoorOpener premiumGarageDoorOpener, int speed) {
		this.premiumGarageDoorOpener = premiumGarageDoorOpener;
		this.speed = speed;
	}
	
	public void openDoor() {
		premiumGarageDoorOpener.openDoor(speed);
	}

	public void closeDoor() {
		premiumGarageDoorOpener.closeDoor(speed);
	}
}
