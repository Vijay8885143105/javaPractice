package interview_Coding;
		// Parent class
		class Animal 
		{
		    void sound() 
		    {
		        System.out.println("Animal makes a sound");
		    }
		}

		// Child class that overrides the sound() method
		class Dog extends Animal 
		{
		    @Override
		    void sound() 
		    {
		        System.out.println("Dog barks");
		    }
		}

		// Main class to test the overriding
		public class MethodOverridding_Example 
		{
		    public static void main(String[] args) 
		    {
		        Animal animal = new Animal(); // Animal reference and object
		        animal.sound(); // Calls Animal's sound()

		        Animal dog = new Dog(); // Animal reference but Dog object
		        dog.sound(); // Calls Dog's sound() (overridden method)
		    }
		}

	


