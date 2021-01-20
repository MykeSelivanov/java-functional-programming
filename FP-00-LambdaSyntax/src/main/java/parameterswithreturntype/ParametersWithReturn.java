package parameterswithreturntype;

public class ParametersWithReturn {
    public static void main(String[] args) {

        // You don't need () if there is only one parameter

        LengthOfString len = str -> str.length();
        int length = len.length("Hello World");

        System.out.println(length);


    }


}
