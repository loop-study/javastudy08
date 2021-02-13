package study.example;

public class StudyMain {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        action(dog);
        action(cat);

        Animal.call();
    }

    // 인터페이스 Animal 구현 객체가 실행된다.
    public static void action(Animal animal) {
        animal.move();
    }
}
