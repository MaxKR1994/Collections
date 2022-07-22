package TopDomains;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> data = Url.getList();
        //Url.display(data);
        Url.fixDataList(data);
        //Url.display(data);
        Map<String, Integer> dataMap = Url.transformListToMap(data);
        Url.getMostCommonData(dataMap);
    }
}
