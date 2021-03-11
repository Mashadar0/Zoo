package animals;

public class Tiger extends Carnivorous implements Run, Swim, Voice{

    public String getTitle(){
        return "Tiger";
    }

    public void run(){
        System.out.println("Tiger is running");
    }
    public void walk(){
        System.out.println("Tiger is walking");
    }
    public void swim(){
        System.out.println("Tiger is swimming");
    }
    public void dive(){
        System.out.println("Tiger is diving");
    }
    public String voice(){
        return "Roar";
    }
    public void sounds(){
        System.out.println("*tiger sounds*");
    }
}
