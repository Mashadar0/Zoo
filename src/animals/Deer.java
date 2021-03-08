package animals;

import aviary.Size;

public class Deer extends Herbivore implements Run, Swim, Voice{

    public Deer(String name){
        this.name = name;
        animalSize = Size.MEDIUM;
    }

    public void run(){
        System.out.println("Deer is running");
    }
    public void swim(){
        System.out.println("Deer is swimming");
    }
    public String voice(){
        return "*deer screams*";
    }
}
