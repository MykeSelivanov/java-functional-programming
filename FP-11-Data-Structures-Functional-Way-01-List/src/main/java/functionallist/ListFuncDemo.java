package functionallist;

import java.util.List;

public class ListFuncDemo {
    public static void main(String[] args) {

        /**
         * Time complexity of operations
         * list() - O(1)
         * addElement() - O(1)
         * reverse() - O(n)
         *
         */

        ListFunc<Integer> listFunc = ListFunc.list(3,7,9,5,14,11);
        // for each
        listFunc.forEach(System.out::println);

        System.out.println("--------------------");

        // add element - will return a new list with old list elements + new element
        ListFunc<Integer> listFunc1 = listFunc.addElement(45);
        listFunc1.forEach(System.out::println);

        System.out.println("--------------------");

        // remove an element
        ListFunc<Integer> listWithout5 = listFunc.removeElement(5);
        listWithout5.forEach(System.out::println);

        System.out.println("--------------------");

        // reverse list
        ListFunc<Integer> reversedList = listFunc.reverseList();
        reversedList.forEach(System.out::println);

        System.out.println("--------------------");

        // concat 2 lists
        ListFunc<Integer> list1 = ListFunc.list(1,2,3,4,5,6);
        ListFunc<Integer> list2 = ListFunc.list(7,8,9);
        ListFunc<Integer> mergedList = ListFunc.concat(list1, list2);

        mergedList.forEach(System.out::println);

        System.out.println("--------------------");

        // create a functional list from another Collection
        // TODO: debug what could be the issue that list is not adding elements
        List<Integer> integerList = List.of(11,12,13,14,15,16,17);
        ListFunc<Integer> listFuncInts = ListFunc.list();
        listFuncInts.addAllElements(integerList);
        listFuncInts.forEach(System.out::println);

    }
}

