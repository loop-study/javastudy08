package study.example;

public interface Father {
    void print();
}

interface Mom {
    void play();
}

// , 로 다중 상속이 가능하다
interface Child extends Father, Mom {
    void study();
}

class Java implements Child{

    @Override
    public void print() {

    }

    @Override
    public void play() {

    }

    @Override
    public void study() {

    }
}
