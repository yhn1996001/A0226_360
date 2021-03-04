package homework.oop;

import homework.t0302.T501;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class T502Ans extends T501 {

    /**
     * @param args
     */
    static String[] title = { "Manufacturer", "Type", "Min.Price", "Price" };
    static String[] Subtotal = { title[2], title[3] };
    static String groupingBy = "Manufacturer";

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        String inputPath = "D:/cars.csv";
        List<Map<String, String>> arrayList = getData(inputPath);

        Map<String, List<Map<String, String>>> groupByMap =  groupBy(arrayList,groupingBy);;
        printTitle();

        for (Map.Entry<String, List<Map<String, String>>> entry : groupByMap.entrySet()) {
            List<Map<String, String>> list = entry.getValue();
            BigDecimal minPrice = new BigDecimal("0");
            BigDecimal price = new BigDecimal("0");

            for (Map<String, String> stringMap : list) {
                minPrice.add(new BigDecimal(stringMap.get(Subtotal[0])));
                price = price.add(new BigDecimal(stringMap.get(Subtotal[1])));

                for (int i = 0; i < title.length; i++) {
                    System.out.print(stringMap.get(title[i])+ "  \t\t\t" );
                }
                System.out.println();
            }
            System.out.println("小計  \t\t\t\t\t\t\t\t" + minPrice + " \t\t" + price);
        }

    }

    private static Map<String,List<Map<String, String>>> groupBy(List<Map<String, String>> list, String groupBytitle) {
        HashMap<String, List<Map<String, String>>> map = new HashMap<>();


        for (Map<String, String> a : list) {
            String manufacturer = a.get(groupingBy);

            if (map.containsKey(manufacturer)) {
                List<Map<String, String>> maps = map.get(manufacturer);
                maps.add(a);
            } else {
                List<Map<String, String>> maps = new ArrayList<>();
                maps.add(a);
                map.put(manufacturer,maps);
            }
        }
        return  map;
    }

    static void printTitle(){
        for (int i = 0; i < title.length; i++) {
            if (i != title.length - 1) {
                System.out.print(title[i] + "\t\t");
            } else {
                System.out.print(title[i] + "\n");
            }
        }
    }
}
