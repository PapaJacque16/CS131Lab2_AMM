/**
 * This class represents a wizard for
 * a D&D type game.
 * @author Aaron McCarley
 * CS131
 */
public class Wizard implements Lockable{
	// Declare the variables.
	private String name = "Merlin";
	private int health = 100;
	private int key = 0;
	private boolean locked = false;
	
	
	public Wizard() {
		this.key = 0;
		this.locked=false;
	}//end empty-argument constructor
	
	
	public Wizard(String name) {
		super();
		this.setName(name);
		
	}// end preferred constructor
	
	public void takeDamage(int health) {
		if(!isLocked());
		int damage = 50;
		this.health = health-damage;
		return;
	}//end takeDamage

	public String getName() {
		return name;
	}//end getName
	
	public void setName(String name) {
		this.name = name;
		
	}//end setName
	
	public int getHealth() {
		return health;
		
	}//end getHealth
	
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth

	public int getKey() {
		return key;
	}//end getKey
	
	public void setKey(int key) {
		if(this.key==0 && key >0);
		this.key=key;
	}//end setKey

	@Override
	public void lock(int key) {
		if (this.key == key) 
			locked = true;
		
	}//end lock

	@Override
	public void unlock(int key) {
		if (this.key == key) 
			locked = true;
	}//end unlock

	@Override
	public boolean isLocked() {
		return locked;	
	}//end isLocked


	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";

	}

}//end class