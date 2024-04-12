package com.coderscampus.Assignment7;



public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		
		myCustomList.add("element1");
		myCustomList.add("element2");
		myCustomList.add("element3");
		myCustomList.add("element4");
		myCustomList.add("element5");
		myCustomList.add("element6");
		myCustomList.add("element7");
		myCustomList.add("element8");
		myCustomList.add("element9");
		myCustomList.add("element10");
		myCustomList.add("element11");
		myCustomList.add("element12");
		myCustomList.add("element13");
		myCustomList.add("element14");
		myCustomList.add("element15");
		myCustomList.add("element16");
		myCustomList.add("element17");
		myCustomList.add("element18");
		myCustomList.add("element19");
		myCustomList.add("element20");
		myCustomList.add("element21");
		myCustomList.add("element22");
		myCustomList.add("Ben Wallace");
		myCustomList.add("element24");
		myCustomList.add("element25");
		myCustomList.add("element26");
		myCustomList.add("element27");
		myCustomList.add("element28");
		myCustomList.add("element 29");
		
		myCustomList.add(0, "Elon Musk");
		myCustomList.add(15, "Tony Soprano");
		myCustomList.add(31, "Barry Sanders");
		
		myCustomList.remove(15);
		
		
		

		
		
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		
		System.out.println("\n");
		System.out.println(myCustomList.getSize());
		System.out.println("\n");

		System.out.println(myCustomList.get(22));
		
	}

}
