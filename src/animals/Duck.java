package animals;

import aviary.Size;

public class Duck extends Herbivore implements Swim, Fly, Voice{

    public Duck(String name){
        this.name = name;
        animalSize = Size.MINIMAL;
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
    public String voice(){
        return "Quack quack";
    }
}
