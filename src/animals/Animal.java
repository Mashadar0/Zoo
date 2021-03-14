package animals;

import aviary.AnimalDiet;
import aviary.Size;
import exeption.WrongFoodException;
import food.Food;

public abstract class Animal {

    String name;
    Size animalSize;

    AnimalDiet animalDiet;
    public abstract AnimalDiet getAnimalDiet();

    public abstract String getName();
    public abstract Size getAnimalSize();

    public abstract boolean eat(Food food) throws WrongFoodException;
    private String title;
    public abstract String getTitle();
}
