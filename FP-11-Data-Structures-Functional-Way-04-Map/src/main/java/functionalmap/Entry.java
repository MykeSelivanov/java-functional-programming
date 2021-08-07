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

    public Entry() {
        this.next = null;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key){
        this.key = key;
    }

}
