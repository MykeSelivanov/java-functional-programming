package functionalmap;

public class MapFunc<K,V> {

    private Entry[] entries;
    private int size;

    public MapFunc(int size) {
        this.size = size;
        this.entries = new Entry[size];

        for (int i = 0; i < size; i++){
            this.entries[i] = new Entry();
        }
    }

    public Integer getHash(K key) {
        return key.hashCode() % size;
    }
}
