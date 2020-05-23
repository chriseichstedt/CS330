public abstract class ChristmasTree {
    String description = "Unknown Tree";
    public boolean hasStar = false;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
