
import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class TestVirtualPetShelter {

	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("name", "description", 100, 100, 100);
		pet2 = new VirtualPet("name2", "description", 100, 100, 100);
	}

	@Test
	public void shouldBeAbleToAddPet() {
		underTest.addPet(pet1);
		VirtualPet retrievedPet = underTest.findPet("name");
		assertEquals(retrievedPet, (pet1));
	}

	@Test
	public void shouldBeAbleAddTwoToPets() {
		underTest.addPet(pet2);
		underTest.addPet(pet1);
		Collection<VirtualPet> allPets = underTest.getAllPets();
//		assertEquals(allPets, containsInAnyOrder(pet1, pet2));
		assertEquals(2, allPets.size());
	}

	@Test
	public void shouldBeAbleToAddDescription() {
		underTest.addPet(pet1);
		VirtualPet retrievedPet = underTest.addDescription(pet1.petName());
		assertEquals(retrievedPet, pet1);
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		underTest.addPet(pet1);
		underTest.addPet(pet2);
		underTest.removePet(pet1);
		VirtualPet retrievedPet = underTest.findPet(pet2.petName());
		assertEquals(retrievedPet, pet2);
	}

	@Test
	public void shouldBeAbleToFeedAllPets() {
		underTest.addPet(pet1);
		underTest.addPet(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		underTest.feedAllPets(allPets, 50);
		assertEquals(pet1.getHunger(), (50));
		equals(pet2.getHunger());

	}

	@Test
	public void shouldBeAbleToWaterAllPets() {
		underTest.addPet(pet1);
		underTest.addPet(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets();
		underTest.water(allPets, 50);
		assertEquals(pet1.getThirst(), (50));
		equals(pet2.getThirst());
	}

	@Test
	public void shouldBeAbleToPlayWithPet() {
		underTest.addPet(pet1);
		underTest.play(pet1.petName(), (50));
		assertEquals(pet1.getboredom(), (50));
	}

}
