import java.util.*;

public class TraditionalSearch {
    
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("tortoise", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("kangaroo", true, false));
        
        // print(animals, new CheckIfHopper());
        print(animals, (Animal a) -> { return a.canHop(); } );
    }
    
    private static void print(List<Animal> animals, CheckTrait trait) {
        for(Animal animal : animals) {
            if( trait.test(animal) ) 
                System.out.println(animal);
        }
    }

}
