public class SilverBalls extends TreeDecorator {
    ChristmasTree christmasTree;

    public SilverBalls(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", Silver Balls";
    }

    public double cost() {
        return 3 + christmasTree.cost();
    }
}
