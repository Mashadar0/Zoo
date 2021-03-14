import animals.*;
import exeption.WrongFoodException;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        try {
            if (animal.eat(food)) {
                System.out.println("Animal is eating");
            } else {
                System.out.println("Animal don't eat it");
            }
        } catch (WrongFoodException exception){
            System.out.println(exception.getMessage());
        }
    }

    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
