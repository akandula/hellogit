package net.ublife.hellomiddleearth;

public class HelloMiddleEarth {
	
	public static void main(String[] args) {
		
		String[] names = { "Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf" };
		
		// print greetings to the fine folks in the Middle Earth
		for (String name : names) {
			System.out.format(" Hello, %s!\n", name);
		
		}
	}

}
