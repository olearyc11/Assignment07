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
		//What do we expect to happen?
		//Expect to have a String with the value of "Colin O'Leary" in the first index of my Custom List
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
		
	}
	
	
		

}
