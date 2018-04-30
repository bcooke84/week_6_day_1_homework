public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }

    public int drink() {
        this.volume += -10;
        return this.volume;
    }

    public int empty() {
        this.volume -= this.volume;
        return this.volume;
    }

    public int fill() {
        int refill = 100 - this.volume;
        this.volume = this.volume + refill;
        return this.volume;
    }


}
