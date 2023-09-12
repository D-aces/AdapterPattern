package SGDO;

import java.util.logging.Logger;

public class BasicGarageDoor implements StdGarageDoorOpener {
    private Logger log = Logger.getLogger(
    		BasicGarageDoor.class.getSimpleName());
    
    GarageDoorAdapter adapter;
    
	@Override
	public void openDoor() {
    	log.info("Garage Door is Opening");

	}

	@Override
	public void closeDoor() {
    	log.info("Garage Door is Closing");

	}
	
	public void openDoor(int speed) {
		adapter.openDoor();
	}
	
	public void closeDoor(int speed) {
		adapter.closeDoor();
	}

}
