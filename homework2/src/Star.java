public class Star extends TreeDecorator {
    ChristmasTree christmasTree;

    public Star(ChristmasTree christmasTree) {
        this.hasStar = christmasTree.hasStar;

        if(christmasTree.hasStar) {
            System.out.println("WARNING: The tree already has a star.");
        }

        this.christmasTree = christmasTree;
        this.hasStar = true;
    }
    public String getDescription() {
        if(christmasTree.hasStar){
            return christmasTree.getDescription();
        }
        return christmasTree.getDescription() + ", Star";
    }

    public double cost() {
        if(christmasTree.hasStar){
            return christmasTree.cost();
        }
        return 4 + christmasTree.cost();
    }
}