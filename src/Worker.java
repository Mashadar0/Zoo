import animals.*;
import food.Food;

public class Worker {

    public void feed(Animal animal, Food food){
        if (animal.eat(food)){
            System.out.println("Animal is eating");
        } else {
            System.out.println("Animal don't eat it");
        }
    }

    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
