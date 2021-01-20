package noparametersnoreturntype;

public class NoParametersNoReturnType {
    public static void main(String[] args) {

        // Simple one line with empty ()

        Name name = () -> System.out.println("John");
        name.myName();

    }

}
