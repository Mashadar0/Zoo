package animals;

public class Elephant extends Herbivore implements Run, Swim, Voice{

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
