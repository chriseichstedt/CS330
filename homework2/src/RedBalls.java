public class RedBalls extends TreeDecorator {
    ChristmasTree christmasTree;

    public RedBalls(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", Red Balls";
    }

    public double cost() {
        return 1 + christmasTree.cost();
    }
}
