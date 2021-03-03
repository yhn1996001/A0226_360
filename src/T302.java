
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

@SuppressWarnings("all")
public class T302 {
    public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("請輸入月份：");
        String s = null;
        s = br.readLine();
        if (s.matches("[0-9]+")) {
            createCalendar(Integer.parseInt(s));
        }
        System.out.println(s.matches("[0-9]+"));

    }

    public static void createCalendar(int month){
        Calendar startCalendar=Calendar.getInstance();
        Calendar endCalendar=Calendar.getInstance();
        int year = new Date().getYear() + 1900;
        int dayOfMonth = 31;
        switch (month) {
            case 2:
                if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
                    dayOfMonth = 29;
                }else{
                    dayOfMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
        }
        System.out.println("輸出結果為：");
        System.out.println("\t\t"+year+" 年 "+month+" 月");
        System.out.println("=========================");
        //在控制台列印我們星期
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //计算出每个月1号是星期幾
        Date date = new Date(year-1900,month-1,1);
        //得到1号是星期幾
        int weekDay = date.getDay();
        int printCount = 0;
        while(printCount < weekDay){
            System.out.print("\t");
            printCount++;
        }
        //列印出具體的某一天並且放在相應的位置上
        int printDay = 1;
        while(printDay <= dayOfMonth){
            System.out.print(printDay);
            System.out.print("\t");
            printDay++;
            printCount++;
//           到了 星期六 要換下一行
            if(printCount % 7 == 0){
                System.out.print("\n");
            }
        }
    }
}
