package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{

    public boolean eat(Food food){
        return food instanceof Meat;
    }
}
