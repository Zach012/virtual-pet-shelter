import java.util.Random;

public class VirtualPet {

	Random random = new Random();

	public int startingHunger = random.nextInt(100);
	
	String petName;
	String petDescription;
	int hunger;
	int thirst;
	int boredom;

	public VirtualPet(String name, String description, int hunger, int thirst, int boredom) {
		this.petName = name;
		this.petDescription = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;

	}

	public String petName() {

		return petName;
	}

	public String petDescription() {

		return petDescription;
	}

	public int getHunger() {

		return hunger;
	}

	public void feedpet(int food) {
		hunger -= food;

	}

	public int getThirst() {

		return thirst;
	}

	public void waterPet(int water) {
		thirst -= water;

	}

	public int getboredom() {

		return boredom;
	}

	public void playWithPet(int play) {
		boredom -= play;

	}

}
