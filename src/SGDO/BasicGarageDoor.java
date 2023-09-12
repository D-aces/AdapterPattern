package SGDO;

import java.util.logging.Logger;

public class BasicGarageDoor implements StdGarageDoorOpener 
{
    private Logger log = Logger.getLogger(BasicGarageDoor.class.getSimpleName());
    private GarageDoorAdapter adapter;
    
	public void openDoor() 
	{
    	log.info("Garage Door is Opening");
	}

	public void closeDoor()
	{
    	log.info("Garage Door is Closing");
	}
	
	public void openDoor(int speed) 
	{
		adapter = new GarageDoorAdapter(speed);
		adapter.openDoor();
	}
	
	public void closeDoor(int speed) 
	{
		adapter = new GarageDoorAdapter(speed);
		adapter.closeDoor();
	}

}
