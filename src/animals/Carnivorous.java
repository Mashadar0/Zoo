package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal{

    public boolean eat(Food food){
        return food instanceof Meat;
    }
}
