package noparametersnoreturntype;

public class NoParametersNoReturnType {
    public static void main(String[] args) {

        Name name = () -> System.out.println("John");
        name.myName();

    }

}
