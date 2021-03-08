package animals;

import aviary.Size;

public class Elephant extends Herbivore implements Run, Swim, Voice{

    public Elephant(String name){
        this.name = name;
        animalSize = Size.LARGE;
    }

    public void run(){
        System.out.println("Elephant is running");
    }
    public void swim(){
        System.out.println("Elephant is swimming");
    }
    public String voice(){
        return "*loud elephant sounds*";
    }
}
