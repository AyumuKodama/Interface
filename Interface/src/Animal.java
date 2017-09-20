
public abstract class Animal {

	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public abstract String eat();
	
	public String walk() {
		return "It walks on " + legs + " legs.";
	}
	
}
