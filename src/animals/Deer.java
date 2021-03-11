package animals;

public class Deer extends Herbivore implements Run, Swim, Voice{

    public String getTitle(){
        return "Deer";
    }

    public void run(){
        System.out.println("Deer is running");
    }
    public void walk(){
        System.out.println("Deer is walking");
    }
    public void swim(){
        System.out.println("Deer is swimming");
    }
    public void dive(){
        System.out.println("Deer is diving");
    }
    public String voice(){
        return "*deer screams*";
    }
    public void sounds(){
        System.out.println("*deer sounds*");
    }
}
