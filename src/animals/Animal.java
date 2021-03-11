package animals;

import food.Food;

public abstract class Animal {

    private String title;
    public abstract String getTitle();

    public abstract boolean eat(Food food);
}
