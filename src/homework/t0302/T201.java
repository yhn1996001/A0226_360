package homework.t0302;
import java.util.HashMap;
import java.util.Map;

public class T201 {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
        int dice1,dice2,dice3;
        for (int i = 0; i < 100; i++) {
            dice1=randInt();
            dice2=randInt();
            dice3=randInt();
            int sum =dice1+dice2+dice3;
            String s = hashMap.get(sum);
            if (s==null){
//              sum在hashMap第一次出現
                hashMap.put(sum,"*");
            }else {
//              sum在hashMap第二次以上出現  +1
                hashMap.put(sum,hashMap.get(sum).concat("*"));
            }
        }
        System.out.println("執行結束，列印出結果：");
        for (Map.Entry<Integer,String> map : hashMap.entrySet()) {
            System.out.println(map.getKey()+":"+map.getValue());
        }
    }
    public static int randInt(){
        return (int)((Math.random() * 6) + 1);
    }
}
//已知執行次數 for
// 只知道終止條件 while不一定會執行一次     do while 保證至少一次