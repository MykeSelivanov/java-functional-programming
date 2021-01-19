package anonymousinnerclass;

public class LambdaIntroRunner {
    public static void main(String[] args) {

        Moveable moveXMile = new DistantMover();
        moveXMile.move(15);

        Moveable moveShort = new ShortDistanceMover();
        moveShort.move(5);

    }

}
