import static java.lang.System.out;

public class Cat extends Animal implements Pet {
	
	private String name;
	
	public Cat(String name) {
		super(4);
		this.name = name;
		
	}
	
	public Cat() {
		super(4);
		name = "";
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println("The cat is playing.");
	}
	
	public String eat() {
		return "It eats mice and cat food.";
	}
	
	
	
	

}
