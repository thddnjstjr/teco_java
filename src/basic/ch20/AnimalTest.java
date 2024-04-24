package basic.ch20;

import basic.ch09.Subway;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.mover();
		animal.eating();
		System.out.println("--------------");
		
		Animal 주소2 = new Tiger();
		
		주소2.mover();
		주소2.eating();
		System.out.println("--------------");
		
		Animal 주소3 = new Human();
		주소3.mover();
		주소3.eating();
		((Human)주소3).readBooks();
		
		System.out.println("--------------");
		
		
		
		
		
		
	} // end of main

} // end of class
