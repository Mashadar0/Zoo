package animals;

public class Eagle extends Carnivorous implements Fly, Voice{


    public void fly(){
        System.out.println("Eagle is flying");
    }
    public String voice(){
        return "*Сry of the eagle*";
    }
}
