package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice{

    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
    public String voice(){
        return "Quack quack";
    }
}
