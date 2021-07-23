package functionallist;

public class ListFuncDemo {
    public static void main(String[] args) {

        ListFunc<Integer> listFunc = ListFunc.list(3,7,9,11);
        // for each
        listFunc.forEach(System.out::println);
        System.out.println("--------------------");

        // add element - will return a new list with old list elements + new element
        ListFunc<Integer> listFunc1 = listFunc.addElement(45);
        listFunc1.forEach(System.out::println);




    }
}
