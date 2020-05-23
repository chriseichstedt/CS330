public class Ruffles extends TreeDecorator {
    ChristmasTree christmasTree;

    public Ruffles(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", Ruffles";
    }

    public double cost() {
        return 1 + christmasTree.cost();
    }
}
