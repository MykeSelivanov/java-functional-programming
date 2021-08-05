package functionaltree;

public class TreeFuncDemo {
    public static void main(String[] args) {

        TreeFunc<Integer> tree1 = TreeFunc.tree(23, 5, 74, 87, 10, 11, 3, 45, 22);
        System.out.println(tree1);

        System.out.println("-------------------");

        tree1.remove(10);
        System.out.println(tree1);

        System.out.println("-------------------");

        System.out.println(tree1.isMember(45));
        System.out.println(tree1.isMember(100));

        System.out.println("-------------------");

        System.out.println(tree1.maxElement());



    }
}
