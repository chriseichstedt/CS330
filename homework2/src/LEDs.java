public class LEDs extends TreeDecorator {
    ChristmasTree christmasTree;

    public LEDs(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", LEDs";
    }

    public double cost() {
        return 10 + christmasTree.cost();
    }
}
