package study.example;

public class Book implements Item {

    private int sellIn = 0;
    private int quality = 0;

    @Override
    public void updateQuality(int sellIn) {
        this.sellIn = sellIn;
    }

    @Override
    public int getQuality() {
        return this.quality;
    }
}
