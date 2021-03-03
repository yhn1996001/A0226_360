package homework.t0302;
import java.util.*;

public class T102 {
//    List
//    Map
//    Set

    public static void main(String[] args) {
//      判斷重複物件 05.12
        System.out.println(String.format("%.2h",255));
        Set<String> hashSet=new HashSet<>();

//      計算15生成數量
        int count =0;
//      總和、平均數
        double sum=0,avg=0;
//      生成到15個浮點數為止
        while (count!=15){
//          浮點數 區間 1~10
            double v = (Math.random() * 9.0)+1.0;
//            0=<Math.random()<1
//            1               10
//                0.9999.....*10
//                  9.9.... +1
//            10.45643216
//            0 +1 >1
//            8.984659 +1
//            9.534654
//            10
//            (Math.random() * (max-min))+1.0;
//          小數保留3位數
            String format = String.format("%.3f", v);
//          判斷浮點數是否加入成功，成功加入表示不重複，反之重複
            if (hashSet.add(format)) {
//              計算加總
                sum=sum+Double.parseDouble(format);
//              計算成功生成浮點數
                count++;
            }
        }
//      計算平均值
        avg=sum/count;
//      hashSet物件轉成陣列
        String[] strings = hashSet.toArray(new String[hashSet.size()]);

//      輸出結果
        System.out.print("陣列：");
        for (String string : strings) {
            System.out.print(string+",");
        }
        System.out.println("");
        System.out.println("總和："+sum);
        System.out.println("平均數："+String.format("%.3f", avg));
    }



}
