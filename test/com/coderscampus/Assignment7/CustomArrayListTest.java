package com.coderscampus.Assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	// Test-Driven Development Methodology
		// Step 1: write a failing test
		// Step 2: write the business logic to make the test pass
		// Step 3: Refactor your code
	
	// Three A's
		//Arrange, Act, Assert
	
	
	@Test
	void should_add_one_item_to_list() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		//Act
		sut.add("Colin O'Leary");
		String expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		//Assert
		assertEquals("Colin O'Leary", expectedResult);
		assertEquals(1, expectedSize);
	}
	
	@Test 
	void should_add_item_at_index() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		//Act
		sut.add(0, "Charles Manson");
		sut.add(1, "Daphne Phillips");
		sut.add(2, "Billy Bob");
		sut.add(3, "Ronald Raegan");
		sut.add(4, "Nancy Drew");
		sut.add(3, "Nancy Raegan");
		sut.add(6, "Mike Tyson");
		//Assert
		assertEquals("Billy Bob", sut.get(2));
		assertEquals("Ronald Raegan", sut.get(4));
		assertEquals(7, sut.getSize());
		assertThrows(IndexOutOfBoundsException.class,() -> sut.add(15, "Bob Evans"));
	}
	
	@Test 
	void should_return_size_of_array() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		//Act
		sut.add(0, "Jeffrey Phillips");
		sut.add(1, "Karl Listner");
		sut.add(2, "Berverley Marsh");
		sut.add(3, "Mikhalyo Mudryk");
		sut.add(4, "Enzo Fernandez");
		Integer expectedSize = sut.getSize();
		//Assert
		assertEquals(5, expectedSize);
	}
	
	@Test
	void should_return_size_of_array_2() {
		CustomList<String> sut = new CustomArrayList<>();
		
		sut.add(0, "Trevor Page");
		sut.add(1, "North Dokota");
		sut.add(2, "Bugsy Williams");
		
		assertEquals(3, sut.getSize());
	}
	
	@Test
	void should_return_element_based_on_index() {
		CustomList<String> sut = new CustomArrayList<>();

		sut.add(0, "Michalea Thornton");
		sut.add(1, "Michelle Branch");
		sut.add(2, "Johann Sebastian Bach");
		sut.add(3, "Claude Debussy");
		sut.add(4, "Phil Foden");
		
		assertEquals("Claude Debussy", sut.get(3));
		assertEquals(sut.get(0), "Michalea Thornton");
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(34));
	}
	
	@Test
	void should_remove_at_specific_index() {
		
	}
	
	
		

}
