package com.coderscampus.Assignment7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		//Act
		sut.add("Colin O'Leary");
		sut.add("Bob Menery");
		sut.add("Samantha Gordon");
		String expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		//Assert
		assertEquals("Colin O'Leary", expectedResult);
		assertEquals("Bob Menery", sut.get(1));
		assertEquals("Samantha Gordon", sut.get(2));
		assertEquals(3, expectedSize);
	}
	
	@Test 
	void should_add_item_at_index() {
		
		CustomList<String> sut = new CustomArrayList<>();
		
		sut.add(0, "Charles Manson");
		sut.add(1, "Daphne Phillips");
		sut.add(2, "Billy Bob");
		sut.add(3, "Ronald Raegan");
		sut.add(4, "Nancy Drew");
		Integer originalSize = sut.getSize();
		sut.add(3, "Nancy Raegan");
		sut.add(6, "Mike Tyson");
		sut.add(0, "William Wallace");
		Integer newSize = sut.getSize();
		
		assertEquals(5, originalSize);
		assertEquals("Billy Bob", sut.get(3));
		assertEquals("Ronald Raegan", sut.get(5));
		assertEquals("William Wallace", sut.get(0));
		assertEquals(8, newSize);
		assertThrows(IndexOutOfBoundsException.class,() -> sut.add(15, "Bob Evans"));
		assertThrows(IndexOutOfBoundsException.class, () -> sut.add(9, "Random Name"));
	}
	
	@Test 
	void should_return_size_of_array() {
		
		CustomList<String> sut = new CustomArrayList<>();
		
		sut.add(0, "Jeffrey Phillips");
		sut.add(1, "Karl Listner");
		sut.add(2, "Berverley Marsh");
		sut.add(3, "Mikhalyo Mudryk");
		sut.add(4, "Enzo Fernandez");
		Integer originalSize = sut.getSize();
		sut.add(5, "Frank Lamprar");
		sut.add(0, "Susan Sarandon");
		Integer newSize = sut.getSize();
		
		assertEquals(5, originalSize);
		assertEquals(7, newSize);
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
		Integer originalSize = sut.getSize();
		sut.add(0, "Bob Saget");
		sut.add(6, "Kevin De Bruyne");
		sut.add(4, "Dustin Johnson");
		Integer newSize = sut.getSize();
		
		assertEquals("Claude Debussy", sut.get(5));
		assertEquals("Michalea Thornton", sut.get(1));
		assertEquals(5, originalSize);
		assertEquals("Kevin De Bruyne", sut.get(7));
		assertEquals(8, newSize);
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(34));
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(8));

	}
	
	@Test
	void should_remove_at_specific_index() {
		CustomList<String> sut = new CustomArrayList<>();

		sut.add(0, "Michalea Thornton");
		sut.add(1, "Michelle Branch");
		sut.add(2, "Johann Sebastian Bach");
		sut.add(3, "Claude Debussy");
		sut.add(4, "Phil Foden");
		Integer originalSize = sut.getSize();
		sut.remove(2);
		Integer newSize = sut.getSize();
		
		assertEquals(sut.get(2), "Claude Debussy");
		assertEquals(sut.get(3), "Phil Foden");
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(6));
		assertEquals(5, originalSize);
		assertEquals(4, newSize);
		assertThrows(IndexOutOfBoundsException.class, () -> sut.get(4));
		
	}
	
	
		

}
