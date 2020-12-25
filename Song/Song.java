//https://courses.cs.washington.edu/courses/cse142/20sp/homework.shtml

public class Song {
    public static void main(String[] args) {
        fly();
        spider();
        bird();
        cat();
        dog();
        pig();
        horse();
    }

    public static void fly() {
        swallow("fly", ".");
        ending();
    }

    public static void spider() {
        swallow("spider", ",");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        swallowAnimal("spider", "fly");
        ending();
    }

    public static void bird() {
        swallow("bird", ",");
        System.out.println("How absurd to swallow a bird.");
        swallowAnimal("bird", "spider");
        swallowAnimal("spider", "fly");
        ending();
    }

    public static void cat() {
        swallow("cat", ",");
        System.out.println("Imagine that to swallow a cat.");
        swallowAnimal("cat", "bird");
        swallowAnimal("bird", "spider");
        swallowAnimal("spider", "fly");
        ending();
    }

    public static void dog() {
        swallow("dog", ",");
        System.out.println("What a hog to swallow a dog.");
        swallowAnimal("dog", "cat");
        swallowAnimal("cat", "bird");
        swallowAnimal("bird", "spider");
        swallowAnimal("spider", "fly");
        ending();
    }

    public static void pig() {
        swallow("pig", ",");
        System.out.println("Talk about eating a pig, whole!");
        swallowAnimal("pig", "dog");
        swallowAnimal("dog", "cat");
        swallowAnimal("cat", "bird");
        swallowAnimal("bird", "spider");
        swallowAnimal("spider", "fly");
        ending();
    }

    public static void horse() {
        swallow("horse", ",");
        System.out.println("She died of course.");
    }
    
    static void swallow(String animal, String ending) {
        System.out.println("There was an old woman who swallowed a " + animal + ending);
    }
    
    static void swallowAnimal(String firstAnimal, String secondAnimal) {
         System.out.println("She swallowed the " + firstAnimal + " to catch the " + secondAnimal + ",");
    }
    
    public static void ending() {
        System.out.println("I don't know why she swallowed that fly,");
        System.out.println("Perhaps she'll die.");
        System.out.println();
    }
}