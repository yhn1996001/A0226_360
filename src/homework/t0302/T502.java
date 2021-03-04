package homework.t0302;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class T502 extends T501 {
//    static String[] title ={"Manufacturer","Type","Min.Price","Price"};
//    static String[] Subtotal ={title[2],title[3]};
//    static String groupingBy="Manufacturer";
//    public static void main(String[] args) throws IOException {
//        String inputPath="./cars2.csv";
//        ArrayList<Map<String, String>> arrayList = getData(inputPath);
//
//        Map<String, List<Map<String, String>>> collect = arrayList.stream().collect(
//                Collectors.groupingBy(x ->(String)x.get(groupingBy)));
//        for (int i = 0; i < title.length; i++) {
//            if (i!=title.length-1){
//                System.out.print(title[i]+" \t\t");
//            }else {
//                System.out.print(title[i]+" \n");
//            }
//        }
//        for (Map.Entry<String, List<Map<String, String>>> entry : collect.entrySet()) {
//            List<Map<String, String>> value = entry.getValue();
//            BigDecimal minPrice=new BigDecimal("0");
//            BigDecimal price=new BigDecimal("0");
//            for (Map<String, String> map : value) {
//                minPrice=minPrice.add(new BigDecimal(map.get(Subtotal[0])));
//                price=price.add(new BigDecimal(map.get(Subtotal[1])));
//                for (int i = 0; i < title.length; i++) {
//                    System.out.print(map.get(title[i]) +"  \t\t\t");
//                }
//                System.out.println();
//            }
//            System.out.println("小計 \t\t\t\t\t\t\t\t"+ minPrice+"\t\t\t"+price);
//        }
//
//    }
}
