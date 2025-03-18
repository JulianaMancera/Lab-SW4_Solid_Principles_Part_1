public class DogApp {
    public static void main(String[] args) {
        
        Pet myPet = new Pet("Blacky", "Sam");
        PetBehavior dogBehavior = new Dog();

        System.out.println("\nPet Name: " + myPet.getPetName());
        System.out.println("Owner: " + myPet.getOwner());
        System.out.println("Sound: " + dogBehavior.makeSound());
        System.out.println("Eating: " + dogBehavior.eat());
    }
}
