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

    private MapFunc(Entry[] entries, int size) {
        this.size = size;
        this.entries = entries;
    }

    public Integer getHash(K key) {
        return key.hashCode() % size;
    }

    public MapFunc<K, V> put(K key, V value){
        int hash = getHash(key);
        Entry existingEntry = entries[hash];
        Entry newEntry = new Entry(key, value);
        entries[hash] = newEntry;
        newEntry.next = existingEntry;

        return new MapFunc<K, V>(entries, size);
    }
}
