public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400);
        doAnimalStuff(animal, "slow");

        Dog dog  = new Dog();
        doAnimalStuff(dog,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }
}
