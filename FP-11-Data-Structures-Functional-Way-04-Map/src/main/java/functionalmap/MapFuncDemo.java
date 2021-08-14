package functionalmap;

public class MapFuncDemo {
    public static void main(String[] args) {

        MapFunc<Integer, String> mapFunc = new MapFunc<>(7);
        mapFunc.put(56, "Peter");
        mapFunc.put(15, "James");
        mapFunc.put(3, "Jamie");
        mapFunc.put(4, "Olha");
        mapFunc.put(5, "Greg");
        mapFunc.put(6, "Jack");
        mapFunc.put(100, "John");
        mapFunc.put(100, "Oliver");

        mapFunc.display();
    }
}
