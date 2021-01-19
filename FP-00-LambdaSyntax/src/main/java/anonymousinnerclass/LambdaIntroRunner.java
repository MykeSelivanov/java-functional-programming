package anonymousinnerclass;

public class LambdaIntroRunner {
    public static void main(String[] args) {

//        Moveable moveXMile = new DistantMover();
//        moveXMile.move(15);
//
//        Moveable moveShort = new ShortDistanceMover();
//        moveShort.move(5);

        Moveable moveXMile = new Moveable() {
            @Override
            public void move(int mile) {
                System.out.println("moving " + mile);
            }
        };

        Moveable moveShort = (int mile) -> {
            System.out.println("moving short mile " + mile);
        };

        Moveable moveUp = mile -> System.out.println("moving up " + mile);

        moveAction(moveXMile);
        moveAction(moveShort);

    }

    public static void moveAction(Moveable moveable){
        moveable.move(100);
    }

}
