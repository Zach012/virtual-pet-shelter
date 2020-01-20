import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public VirtualPet findPet(String petName) {

		return pets.get(petName);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.petName(), pet);
	}

	public Collection<VirtualPet> getAllPets() {

		return pets.values();
	}

	public VirtualPet addDescription(String petName) {
		VirtualPet petDescription = findPet("name");

		return petDescription;
	}

	public void removePet(VirtualPet pet) {
		pets.remove(pet.petName(), pet);

	}

	public void feedAllPets(Collection<VirtualPet> allPets, int food) {
		{
			VirtualPet feedPets = findPet("name");
			feedPets.feedpet(food);
		}
	}

	public void water(Collection<VirtualPet> allPets, int water) {
		VirtualPet waterPet = findPet("name");
		waterPet.waterPet(water);

	}

	public void play(String petName, int play) {
		VirtualPet playWithPet = findPet("name");
		playWithPet.playWithPet(play);

	}

}
