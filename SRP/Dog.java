public class Dog implements PetBehavior{
    @Override
    public String makeSound(){
        return "Bark!";
    }

    @Override
    public String eat(){
        return "Eating dog food";
    }
}