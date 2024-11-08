//After overriding the method, only the bird constructor uses the overridden method
//However, the original Animal constructor still uses the old method.
//This tells us that if you override a method in a subclass, you can still access the original method.
//The only one that didnt work was Bird = new Animal();. This is likely because the constructor for animal
//does not have enough parameters to fill in for bird, which can't function 
//because it is missing parameters.
public class Driver{
  public static void main(String[] args) {
    Animal cat = new Animal ("meow", 2, "green mario");
    Animal dog = new Animal ("woof", 2, "red luigi");
    cat.speak();
    dog.speak();
    Bird bird = new Bird ("tweet", 2, "pink daisy", 100, "pink");
    bird.speak();
    //Bird bird2 = new Animal("squack", 2, "yellow peach");
    Animal dinosaur = new Bird("caw caw", 100000000, "mark zuckerberg", 4, "green");
  }
}
