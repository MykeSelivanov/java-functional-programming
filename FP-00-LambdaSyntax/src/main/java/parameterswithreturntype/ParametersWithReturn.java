package parameterswithreturntype;

public class ParametersWithReturn {
    public static void main(String[] args) {

        LengthOfString len = str -> str.length();
        int length = len.length("Hello World");

        System.out.println(length);


    }


}
