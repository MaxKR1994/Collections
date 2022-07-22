package Tree.TreeMap;
import java.util.*;
public class MyTreeMap<K,V> implements MyMap<K,V> {

    private MyMap.MyEntry<K,V> root;
    private int size;
    private Set<K> keySet;

    public MyTreeMap(){
        root = null;
        size = 0;
    }

    private static class Entry<K,V> implements MyMap.MyEntry<K,V>{
        private V value;
        private K key;
        Entry<K,V> left;
        Entry<K,V> right;
        Entry<K,V> parent;

        public Entry(K key, V value, Entry<K, V> parent) {
            this.value = value;
            this.key = key;
            this.parent = parent;
        }

        public Entry<K,V> getLeft(){
            return left;
        }

        public Entry<K,V> setRight(Entry<K,V> right){
            return this.right = right;
        }

        public Entry<K,V> getParent(){
            return parent;
        }

        public Entry<K,V> setParent(Entry<K,V> parent){
            return this.parent = parent;
        }

        public Entry<K,V> setLeft(Entry<K,V> left){
            return this.left = left;
        }

        public Entry<K,V> getRight(){
            return right;
        }

        @Override
        public void setRight(MyEntry<K, V> newNode) {
            this.right = right;
        }

        @Override
        public void setLeft(MyEntry<K, V> newNode) {
            this.left = left;
        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(K key) {
        return getEntry(key) != null;
    }

    public Entry<K, V> getEntry(K key) {
        Entry<K, V> entry = (Entry<K, V>) root, returnEntry;
        int result = 0;
        while (entry != null) {
            result = ((Comparable<K>) entry.getKey()).compareTo(key);
            if (result == 0) {
                return entry;
            } else if (result > 0) {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }
        return null;
    }

    @Override
    public V get(K key) {
        Entry<K, V> entry = getEntry(key);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        Entry<K, V> entry = (Entry<K, V>) root, parent = null, newNode;
        int result = 0;
        while (entry != null) {
            parent = entry;
            result = ((Comparable<K>) entry.getKey()).compareTo(key);
            if (result == 0) {
                entry.setValue(value);
                return value;
            } else if (result > 0) {
                entry = entry.getLeft();
            } else {
                entry = entry.getRight();
            }
        }

        newNode = new Entry<K, V>(key, value, parent);
        if (parent == null) {
            root = newNode;
        } else if (result > 0) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }
        size++;
        return value;
    }
}
