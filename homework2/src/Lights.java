public class Lights extends TreeDecorator {
    ChristmasTree christmasTree;

    public Lights(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;
        this.christmasTree = christmasTree;
    }

    public String getDescription() {
        return christmasTree.getDescription() + ", Lights";
    }

    public double cost() {
        return 5 + christmasTree.cost();
    }
}
