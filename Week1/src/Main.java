package src;

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new CalculatorInher();

        System.out.println("1234 + 4321 = " + calculator.plus(1234, 4321));
        System.out.println("911 - 170 = " + calculator.minus(911, 170));
        System.out.println("2 * 3 = " + calculator.mul(2, 3));
        System.out.println("33 / 11 = " + calculator.div(33, 11));

        System.out.println("\n");

        Cat cat = new Cat("cat"); // 다른 동물 하셔도 상관 없습니다!
        Dog dog = new Dog("dog");
        Animal[] animals = new Animal[]{cat, dog};

        int p= animals.length;
        for (int r = 0; r<p; r++) {
            Animal animal = animals[r];
            animal.speak();

        }
    }
}
