package animals;

import aviary.Size;
import exeption.WrongFoodException;
import food.Food;

public abstract class Animal {

    String name;
    Size animalSize;

    public abstract String getName();
    public abstract Size getAnimalSize();

    public abstract boolean eat(Food food) throws WrongFoodException;
    private String title;
    public abstract String getTitle();

    public abstract boolean eat(Food food);
}
