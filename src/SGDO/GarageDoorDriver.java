package SGDO;

import java.util.logging.Logger;

public class GarageDoorDriver 
{
    private Logger log = Logger.getLogger(GarageDoorDriver.class.getSimpleName());

	public void openDoor(int speedLevel)
	{
		log.info("Garage Door Opening at a speed-level of: " + speedLevel + "\n");
	}
	public void closeDoor(int speedLevel)
	{
		log.info("Garage Door Closing at a speed-level of: " + speedLevel + "\n");
	}
}
