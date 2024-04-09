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
		sut.add(5, "Colin O'Leary");
		sut.add(2, "Elon Musk");
		sut.add(1, "Cristiano Ronaldo");
		sut.add(3, "Didier Drogba");
		sut.add(4, "Mike Tyson");
		sut.add(3, "Bobby Boucher");
		//Assert
		assertEquals("Didier Drogba", sut.get(4));
		assertEquals("Mike Tyson", sut.get(5));
		assertEquals("Bobby Boucher", sut.get(3));
	}
	
		

}
