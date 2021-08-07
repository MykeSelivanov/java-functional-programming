package functionalmap;

public class Entry {

    Object key;
    Object value;
    Entry next;

    public Entry(Object key, Object value){
        this.key = key;
        this.value = value;
        this.next = null;
    }

}
