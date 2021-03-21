package builderdesignpattern;

public class BuilderDesignPatternFunctionalWay {
    public static void main(String[] args) {

        /**
         * Builder Design pattern is all about providing flexibility in Object Creation. The intent of the builder
         * design pattern is to isolate the construction of a complex object from its representation.
         *
         * With builder pattern we also insure the immutability of the object after it's creation
         *
         * Ex of builder in JDK are:
         * java.lang.StringBuilder
         * java.lang.StringBuffer
         *
         *StringBuilder sb = new StringBuilder();
         * sb.append("Test"); - append() method returns the instance of itself, after adding values to it
         */

        MobileBuilder builder = new MobileBuilder();

        Mobile myMobile = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.battery = 4000;
            myBuilder.processor = "A14";
        }).createMobile();

        System.out.println(myMobile);

    }
}
