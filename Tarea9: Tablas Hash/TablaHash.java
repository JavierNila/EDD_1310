package fes;

public class TablaHash<Key, Value> {
    private class Entry {
        public Key key;
        public Value value;
        public int hash;

        public Entry(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.hash = key.hashCode();
        }

      
        public boolean equals(Object otherEntry) {
            @SuppressWarnings("unchecked")
			Entry other = (Entry) otherEntry;
            if(this.hash != other.hash)
            return false;
            return this.key.equals(other.key);
        }
    }

    private int tableSize;
    private ListaSimplementeLigada<Entry>[] entries;

    @SuppressWarnings("unchecked")
	public TablaHash(int tableSize) {
        this.tableSize = tableSize;
        this.entries = new ListaSimplementeLigada[tableSize];
        for(int i = 0; i < tableSize; i++) {
            entries[i] = new ListaSimplementeLigada<>();
        }
    }

    private int normalizeIndex(int hashKey) {
        return (hashKey & 0x7FFFFFFF) % tableSize;
    }

    public void add(Key key, Value value) {
        Entry entrada = new Entry(key, value);
        int indice = normalizeIndex(entrada.hash);
        if (entries[indice] == null) {
            entries[indice] = new ListaSimplementeLigada<>();
            entries[indice].addFirst(entrada);
        } else {
            if (entries[indice].search(entrada) >= 0) {
                entries[indice].update(entrada, entrada);
            } else {
                entries[indice].addFirst(entrada);
            }
        }
    }

    public Value valueOf(Key keyToSearch) {
        int bucketIndex = normalizeIndex(keyToSearch.hashCode());
        if (entries[bucketIndex] == null || entries[bucketIndex].isEmpty())
        return null;
        Entry entry = new Entry(keyToSearch, null);
        Entry index = entries[bucketIndex].getValue(entry);
        if (index == null)
        return null;
        return index.value;
    }

    public void remove(Key keyToRemove) {
        Entry aux = new Entry(keyToRemove, null);
        int bucketIndex = normalizeIndex(keyToRemove.hashCode());
        entries[bucketIndex].deleteValue(aux);
    }

}