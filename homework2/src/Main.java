public class Main {
    public static void main(String args[]){
        ChristmasTree mytree = new ColoradoBlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        System.out.println("My Tree: " + mytree.getDescription());
        System.out.println("Cost $" + mytree.cost());

        ChristmasTree mytree2 = new BalsamFir();
        mytree2 = new Star(mytree2);
        mytree2 = new BlueBalls(mytree2);
        mytree2 = new Star(mytree2);
        mytree2 = new BlueBalls(mytree2);
        System.out.println("My Tree: " + mytree2.getDescription());
        System.out.println("Cost $" + mytree2.cost());

        ChristmasTree mytree3 = new DouglasFir();
        mytree3 = new Star(mytree3);
        mytree3 = new RedBalls(mytree3);
        mytree3 = new Star(mytree3);
        mytree3 = new RedBalls(mytree3);
        System.out.println("My Tree: " + mytree3.getDescription());
        System.out.println("Cost $" + mytree3.cost());

        ChristmasTree mytree4 = new FraserFir();
        mytree4 = new Star(mytree4);
        mytree4 = new SilverBalls(mytree4);
        mytree4 = new Star(mytree4);
        mytree4 = new SilverBalls(mytree4);
        System.out.println("My Tree: " + mytree4.getDescription());
        System.out.println("Cost $" + mytree4.cost());
    }
}
