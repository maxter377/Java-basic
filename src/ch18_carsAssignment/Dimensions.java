package ch18_carsAssignment;

public class Dimensions {

    private int height;
    private int width;
    private int trunkCapacity;

    public Dimensions(int height, int width, int trunkCapacity) {
        this.height = height;
        this.width = width;
        this.trunkCapacity = trunkCapacity;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }
}
