
public class Fish extends Animal implements Pet {

	String name;
	
	public Fish() {
		super(0);
		name = "Piscene";
	}
	
	public void play() {
		System.out.println("The fish is playing.");
	}
	
	public String walk() {
		return "Fishes cannot walk.";
	}
	
	public String eat() {
		return "Fishes eat fish food.";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
