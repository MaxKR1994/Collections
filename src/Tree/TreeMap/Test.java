package Tree.TreeMap;

public class Test {
    public static void main(String[] args) {
        MyTreeMap<Integer,String> testMap = new MyTreeMap<>();
        testMap.put(1,"Java");
        testMap.put(2,"Python");
        testMap.put(3,"PHP");
        testMap.put(4,"C++");
        testMap.put(5,"Kotlin");

        System.out.println("Map size: " + testMap.size());
        System.out.println(testMap.get(3));
        System.out.println(testMap.containsKey(4));
        System.out.println(testMap.containsKey(6));
        System.out.println(testMap.isEmpty());
    }
}
