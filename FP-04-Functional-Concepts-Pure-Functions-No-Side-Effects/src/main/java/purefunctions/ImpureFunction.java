package purefunctions;

public class ImpureFunction {

    private int value = 0;

    // Method add uses a member variable to calculate it's return value
    // it also modifies the state of value member variable - it has a side effect
    public int add(int nextValue){
        this.value += nextValue;
        return this.value;
    }

}
