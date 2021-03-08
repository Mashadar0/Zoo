package animals;

import aviary.Size;
import exeption.WrongFoodException;
import food.Food;
import food.Grass;

public class Herbivore extends Animal {

    public String getName() {
        return name;
    }
    public Size getAnimalSize() {
        return animalSize;
    }

    public boolean eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            return true;
        } else throw new WrongFoodException();
    }
}
