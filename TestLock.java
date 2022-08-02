
public class TestLock {

	public static void main(String[] args) 
	{
	
		Wizard wizard = new Wizard();
		System.out.println("Entry through Camelot's Doors with Spell from " + wizard.toString() + ", Is the Door Locked: No, Success!");
		wizard.setKey(1);
		wizard.unlock(1);
		
        System.out.println("Entry to Tirith's Doors with Spell from " + wizard.toString() + ", Is the Door Locked: Yes, -100 health, and the Wizard is dusted!");
        wizard.setKey(1);
        wizard.lock(1);
  
           
	}//end main
	
}//end class

