package animals;

import aviary.Size;

public class Duck extends Herbivore implements Swim, Fly, Voice{

    public Duck(){}
    public Duck(String name){
        this.name = name;
        animalSize = Size.MINIMAL;
    }

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

    @Override
    public boolean equals(Object obj) {
        return name.equals((String) obj);
    }
    @Override
    public int hashCode() {
        return (int) name.charAt(0);
    }
}
