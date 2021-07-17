package functionallist;

public class ListFuncDemo {
    public static void main(String[] args) {

        ListFunc<Integer> listFunc = ListFunc.list(3,7,9,11);
        listFunc.forEach(System.out::println);

    }
}
