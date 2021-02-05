package unaryoperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {
    public static void main(String[] args) {

        /**
         * UnaryOperator<T> extends Function<T,T>
         * accepts one type and returns the same type
         */

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8);

        UnaryOperator<Integer> operator = i -> i * 100;

        List<Integer> newList = mapper(nums, operator);

        System.out.println(newList);

    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator){
        List<T> newList = new ArrayList<>();
        for (T t: list){
            T element = operator.apply(t);
            newList.add(element);
        }
        return newList;
    }

}
