package study.example;

public interface Animal {

    void cry();
    void age();

    default void move() {
        nomalCap();
        System.out.println("움직인다");
    }

    static void call() {
        staticCap();
        System.out.println("구현 객체가 필요없다");
    }

    private void nomalCap() {
        System.out.println("private method");
    }

    // static 메소드에서 사용하려면 static을 붙여야한다.
    private static void staticCap() {
        System.out.println("private static method");
    }
}

class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("멍멍멍멍멍 왈오랑롸와와오아롸롸와왕왈");
    }

    @Override
    public void age() {
        System.out.println("1살");
    }
}

class Cat implements Animal {

    @Override
    public void cry() {
        System.out.println("야옹야오야오야오야");
    }

    @Override
    public void age() {
        System.out.println("5살");
    }
}


