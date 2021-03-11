package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice{

    public String getTitle(){
        return "Duck";
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void dive(){
        System.out.println("Duck is diving");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }
    public void soar(){
        System.out.println("Duck is soars");
    }
    public String voice(){
        return "Quack quack";
    }
    public void sounds(){
        System.out.println("*duck sounds*");
    }
}
