package logicalQuestions;

public class mOverriding {

    static class Animal {
        void makeSound() {
            System.out.println("Animal Sound");
        }
    }

    static class BabyAnimal extends Animal {
        @Override
        void makeSound() {
            System.out.println("Baby animal sound");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Animal b = new BabyAnimal();
        b.makeSound();
    }
}