package exeption;

public class WrongFoodException extends Exception{

    public WrongFoodException(){
        System.out.println("Unsuitable food");
    }
}
