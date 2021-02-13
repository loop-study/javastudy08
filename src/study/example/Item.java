package study.example;

public interface Item {

    // 상수
    int MAX_QUALITY = 100;
    int MIX_QUALITY = 0;

    // 추상 메소드
    void updateQuality(int sellIn);
    int getQuality();

    // default 메소드
    default void saleOut() {
        System.out.println("sale out");
    }

    // static 메소드
    static void clearItem() {
        System.out.println("clear item");
    }
}
