package animals;

public class Shark extends Carnivorous implements Swim {

    public String getTitle(){
        return "Shark";
    }

    public void swim(){
        System.out.println("Shark is swimming");
    }
    public void dive(){
        System.out.println("Shark is diving");
    }
}
