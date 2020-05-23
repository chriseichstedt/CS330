public class Ribbons extends TreeDecorator {
    ChristmasTree christmasTree;

    public Ribbons(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", Ribbons";
    }

    public double cost() {
        return 2 + christmasTree.cost();
    }
}
