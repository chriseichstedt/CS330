public class BlueBalls extends TreeDecorator {
    ChristmasTree christmasTree;

    public BlueBalls(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", Blue Balls";
    }

    public double cost() {
        return 2 + christmasTree.cost();
    }
}
