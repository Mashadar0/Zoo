package animals;

import aviary.AnimalDiet;
import aviary.Size;
import exeption.WrongFoodException;
import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal {

    public AnimalDiet getAnimalDiet(){
        return AnimalDiet.HERBIVORE;
    }

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
