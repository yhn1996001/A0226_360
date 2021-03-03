import java.io.*;
import java.util.*;

public class T501 {
    private static void outData(ArrayList<Map<String, String>> arrayList, String outputPath)throws IOException{
        FileWriter fw=new FileWriter(outputPath);
        BufferedWriter bw=new BufferedWriter(fw);
        String[] title ={"Manufacturer","Type","Min.Price","Price"};
        StringBuilder sb=new StringBuilder();

        for (int i1 = 0; i1 < title.length; i1++) {
            if (i1!=title.length-1){
                bw.write(title[i1]+",");
            }else {
                bw.write(title[i1]+"\n");
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Map<String, String> map = arrayList.get(i);
            for (int i1 = 0; i1 < title.length; i1++) {
                if (i1==title.length-1){
                    bw.write( map.get(title[i1])   +"\n");
                }else {
                    bw.write(map.get(title[i1])+",");
                }
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }
    public static ArrayList<Map<String,String>> getData(String inputPath ) throws IOException {
        FileReader fr = new FileReader(inputPath);
        BufferedReader br=new BufferedReader(fr);

        ArrayList<Map<String,String>> arrayList=new ArrayList<Map<String, String>>();

         String[] title;
        String s = br.readLine();
        if(s.startsWith("\uFEFF")) {
             title = s.replace("\uFEFF", "")
                      .trim()
                      .split(",");
        }else {
              title = s.trim().split(",");
        }
        while (br.ready()) {
            String data=br.readLine();
            String[] split = data.trim().split(",");
            HashMap<String, String> hashMap = new HashMap<>();
            for (int i = 0; i < split.length; i++) {
                hashMap.put(title[i],split[i]);
            }
            arrayList.add(hashMap);
        }
        br.close();
        fr.close();
        return  arrayList;
    }
    public static long gettime(){
       return System.currentTimeMillis();
    }
    public static void main(String[] args) throws Exception {
        long start=gettime(),end=0l;
        String inputPath="./car.csv";
        String outputPath="./cars2.csv";
        ArrayList<Map<String, String>> arrayList = getData(inputPath);
        Collections.sort(arrayList, new Comparator<Map<String, String>>() {
            @Override
            public int compare(Map<String, String> o1, Map<String, String> o2) {
                String s1 = o1.get("Price");
                String s2 = o2.get("Price");
                double d1 = Double.parseDouble(s1);
                double d2 = Double.parseDouble(s2);
                return -Double.compare(d1,d2);
            }
        });
        outData(arrayList,outputPath);

        
        end=gettime();
        System.out.println((end-start));
        
    }

}
