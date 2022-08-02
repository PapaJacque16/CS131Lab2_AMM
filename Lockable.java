
public interface Lockable {

	// Sets the objects as int key.
	void setKey(int key);
    void lock(int key);
    void unlock(int key);
    boolean isLocked();
	
	// True the object is unlocked, and false and locked.

	}//end interface