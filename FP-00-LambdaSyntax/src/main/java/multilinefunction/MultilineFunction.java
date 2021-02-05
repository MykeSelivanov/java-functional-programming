package multilinefunction;

public class MultilineFunction {
    public static void main(String[] args) {

        LengthOfString len = str -> {
            int l = str.length();
            System.out.println("The length is " + l);
            return l;
        };

        int length = len.length("Hello World");
        System.out.println(length);

    }

}
