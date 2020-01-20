import java.util.Scanner;

public class VirtualPetShelterApp {

	private static String petName;
	private static VirtualPet pet;

	public static void main(String[] args) {

		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		System.out.println("Thank you for volunterring.");

		System.out.println("Name | Hunger | Thirst | Boredom ");

		System.out.println("What would you like to do?");
		System.out.println("[1] Feed the pets");
		System.out.println("[2] Water the pets");
		System.out.println("[3] Play with a pet");
		System.out.println("[4] Adopt a pet");
		System.out.println("[5] Admit a pet");
		System.out.println("[6] Quit");
		int userChoice = input.nextInt();
		
		if (userChoice == 1) {
			myVirtualPetShelter.feedAllPets(null, userChoice);
		} if (userChoice == 2) {
			myVirtualPetShelter.water(null, userChoice);
		} if (userChoice == 3) {
			System.out.println("Which pet do you want to play with?");
			myVirtualPetShelter.play(petName, userChoice);
		} if (userChoice == 4) {
			myVirtualPetShelter.removePet(pet);
		} if (userChoice == 5) {
			myVirtualPetShelter.addPet(pet);
			myVirtualPetShelter.addDescription(petName);
		} if (userChoice == 6) {
			System.out.println("Good bye!");
			System.exit(6);
		}
		
		input.close();
	} 

}
