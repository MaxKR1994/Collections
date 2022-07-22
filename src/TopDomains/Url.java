package TopDomains;

import java.io.*;
import java.util.*;

public class Url {

    public static List<String> getList() throws IOException {
        BufferedReader input = null;
        List<String> dataList = new ArrayList<>();
        try {
            input = new BufferedReader(new FileReader("src\\TopDomains\\urls.txt"));
            String url;
            while ((url= input.readLine()) != null){
                dataList.add(url);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (input != null){
                input.close();
            }
        }
        return dataList;
    }

    public static void display (Collection<String> list){
        for(String data : list){
            System.out.println(data);
        }
    }

    public static void fixDataList(List<String> dataList) {
        dataList.replaceAll(s -> s.split("/")[0]);
    }

    public static Map<String, Integer> transformListToMap(List<String> dataList) {
        Map<String, Integer> dataMap = new HashMap<>();
        for (String key : dataList) {
            if (!dataMap.containsKey(key)){
                dataMap.put(key, 1);
            } else {
                int num = dataMap.get(key);
                dataMap.replace(key, num + 1);
            }
        }
        return dataMap;
    }

    public static void getMostCommonData(Map<String, Integer> dataMap) {
        System.out.println("Top repeating list items: ");
        dataMap.entrySet()
               .stream()
               .sorted(Map.Entry.<String, Integer>comparingByValue()
               .reversed())
               .limit(10)
               .forEach(System.out::println);
    }
}
