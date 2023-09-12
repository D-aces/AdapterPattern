package SGDO;

public class TestGarageDoors {
	public static void main (String [] args) {
		PremiumGarageDoorOpener premiumGarageDoorOpener = new PremiumGarageDoorOpener();
		GarageDoorAdapter garageDoorAdapter = new GarageDoorAdapter(premiumGarageDoorOpener, 15);
		garageDoorAdapter.openDoor();
		garageDoorAdapter.closeDoor();
	}
}
