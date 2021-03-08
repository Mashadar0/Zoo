package animals;

import aviary.Size;

public class Tiger extends Carnivorous implements Run, Swim, Voice{

    public Tiger(String name){
        this.name = name;
        animalSize = Size.MEDIUM;
    }

    public void run(){
        System.out.println("Tiger is running");
    }
    public void swim(){
        System.out.println("Tiger is swimming");
    }
    public String voice(){
        return "Roar";
    }
}
