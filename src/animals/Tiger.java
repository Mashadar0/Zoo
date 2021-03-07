package animals;

public class Tiger extends Carnivorous implements Run, Swim, Voice{

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
