package functionalmap;

public class MapFuncDemo {
    public static void main(String[] args) {

        MapFunc<Integer, String> mapFunc = new MapFunc<>(5);
        mapFunc.put(1, "Peter");
        mapFunc.put(1, "James");
        mapFunc.put(1, "Jamie");
        mapFunc.put(1, "Olha");
        mapFunc.put(1, "Greg");

        System.out.println(mapFunc.toString());

    }
}
