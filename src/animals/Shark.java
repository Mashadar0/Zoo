package animals;

import aviary.Size;

public class Shark extends Carnivorous implements Swim {

    public Shark(String name){
        this.name = name;
        animalSize = Size.MEDIUM;
    }


    public void swim(){
        System.out.println("Shark is swimming");
    }
}
