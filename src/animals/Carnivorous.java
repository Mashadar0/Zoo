package animals;

import aviary.Size;
import exeption.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal{

    public String getName() {
        return name;
    }
    public Size getAnimalSize() {
        return animalSize;
    }

    public boolean eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            return true;
        } else throw new WrongFoodException();
    }
}
