package net.ublife.hellomiddleearth;

public class HelloMiddleEarth {
	
	public static void main(String[] args) {
		
		String[] names = { "Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf", "Boromir", "Faramir" };
		
		// print greetings
		for (int i=0; i < names.length; i++) {
			System.out.format(" Hello, %s!\n", names[i]);
			System.out.println("How are you doing today?");
		
		}
	}

}
