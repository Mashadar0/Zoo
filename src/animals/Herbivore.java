package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    public boolean eat(Food food){
        return food instanceof Grass;
    }
}
