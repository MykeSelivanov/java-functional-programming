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

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }
}
