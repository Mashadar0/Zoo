package animals;

public class Deer extends Herbivore implements Run, Swim, Voice{


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
