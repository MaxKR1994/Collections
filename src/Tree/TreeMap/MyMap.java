package Tree.TreeMap;

import java.util.TreeMap;

public interface MyMap<K,V> {
    public int size();
    public boolean isEmpty();
    public boolean containsKey(K key);
    public V get(K key);
    public V put(K key, V value);
    interface MyEntry<K,V>{
        K getKey();
        V getValue();
        V setValue(V value);
        MyEntry<K,V> getRight();
        MyEntry<K,V> getLeft();
        void setRight(MyEntry<K, V> newNode);
        void setLeft(MyEntry<K, V> newNode);
    }
}
