package SGDO;

import java.util.logging.Logger;

public class GarageDoorDriver 
{
    private Logger log = Logger.getLogger(GarageDoorDriver.class.getSimpleName());

<<<<<<< HEAD
	public void openDoor(int speedLevel){
=======
	public void openDoor(int speedLevel)
	{
>>>>>>> refs/remotes/origin/main
		log.info("Garage Door Opening at " + speedLevel + " speed");
	}
	public void closeDoor(int speedLevel)
	{
		log.info("Garage Door Closing " + speedLevel + " speed");
	}
}
