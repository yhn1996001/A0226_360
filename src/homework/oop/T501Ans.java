package homework.oop;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class T501Ans {
    static String [] title;

    private static void outData(ArrayList<Map<String, Object>> arrayList, String outputPath) throws IOException {
        FileWriter fw = new FileWriter(outputPath);
        BufferedWriter bw = new BufferedWriter(fw);

        for (int i1 = 0; i1 < title.length; i1++) {
            if (i1 != title.length - 1) {
                bw.write(title[i1] + ",");
            } else {
                bw.write(title[i1] + "\n");
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Map<String, Object> map = arrayList.get(i);
            for (int i1 = 0; i1 < title.length; i1++) {
                if (i1 == title.length - 1) {
                    bw.write(map.get(title[i1]) + "\n");
                } else {
                    bw.write(map.get(title[i1]) + ",");
                }
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }
    public static ArrayList<Map<String, Object>> getData(String inputPath) throws IOException {
        FileReader fr = new FileReader(inputPath);
        BufferedReader br = new BufferedReader(fr);
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();

        String s = br.readLine();
        if (s.startsWith("\uFEFF")) {
            title = s.replace("\uFEFF", "").trim().split(",");
        } else {
            title = s.trim().split(",");
        }
        while (br.ready()) {
            String data = br.readLine();
            arrayList.add(dataToMap(data));

        }
        br.close();
        fr.close();
        return arrayList;
    }

    public static Map dataToMap (String data){
        String[] split = data.trim().split(",");
        HashMap<String, Object> hashMap = new HashMap<>();
        for (int i = 0; i < split.length; i++) {

            if (split[i].matches("[0-9]+\\.[0-9]+") || split[i].matches("[0-9]+")){
                hashMap.put(title[i],new BigDecimal(split[i]));
            }else {
                hashMap.put(title[i], split[i]);
            }
        }
        return hashMap;
    }

    public static long gettime() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) throws Exception {
        long start = gettime(), end = 0l;
        String inputPath = "./car.csv";
        String outputPath = "./cars2.csv";
        ArrayList<Map<String, Object>> arrayList = getData(inputPath);

        Collections.sort(arrayList, new T501Ans.Sortdata());
        outData(arrayList, outputPath);
        end = gettime();
        System.out.println((end - start));
    }

    private  static class Sortdata implements Comparator<Map>{

        String sortTitle;

        public Sortdata(){
            System.out.println("-------Sortdata-----------");
            sortTitle="Price";
        }
        public Sortdata(String sortTitle){
            this.sortTitle=sortTitle;
        }

        @Override
        public int compare(Map o1, Map o2) {

            if (o1.get(sortTitle) instanceof BigDecimal && o2.get(sortTitle) instanceof BigDecimal ){
                BigDecimal price1 =(BigDecimal) o1.get(sortTitle);
                BigDecimal price2 =(BigDecimal) o2.get(sortTitle);
                return -price1.compareTo(price2);
            }
            throw new RuntimeException("排序欄位的資料型態錯誤");
        }
    }
}
