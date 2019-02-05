import com.capgemini.beans.Animal;
import com.capgemini.beans.Cat;

public class Entry {

	public static void main(String[] args) {
		
		Animal animalRef;
		
//		animalRef = new Animal();
		
//		IMPLICIT UP-CASTING
		animalRef = (Animal)new Cat();
		
		animalRef.eat();
		animalRef.sleep();
		animalRef.roam();
		
//		animalRef.meow();
		
//		EXPLICIT DOWN-CASTING
		Cat catRef = (Cat)animalRef;
		
		catRef.meow();
		
	}
	
}
