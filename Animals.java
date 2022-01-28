package testing;

public class Animals {

	
		int age;
		String name;
		int Weight;
		String kind;
	
	
		void place_of_animal()
		{
			System.out.println("Animals are live in the forest");
			
	}
		void sense_of_animal()
		{
			System.out.println("Animals have 5 senses");
		}
		void display()
		
		{
			System.out.println("Name of the animal is"+ name);
			System.out.println("Kind of the animal is"+ kind);
			System.out.println("Weight of the animal is"+ Weight);
			System.out.println("Age of the animal is"+ age);
		
		}
		

		public static void main(String[] args) {
			Animals abc=new Animals();
			abc.name="Lion";
			abc.kind="Wild Animal";
			abc.Weight=150;
			abc.age=20;
			abc.place_of_animal();
			abc.sense_of_animal();
			abc.display();
		}
		}
			

