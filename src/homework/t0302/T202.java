package homework.t0302;
import java.math.BigDecimal;
import java.util.*;

public class T202 {
	
	 
	
    public static void main(String[] args) {
        Set<BigDecimal> set = getSet(15);
//suppresswarning
        ArrayList<BigDecimal> collection= new ArrayList<BigDecimal>(set);
      
      
        Collections.sort(collection, new MyComparator());
//          collection.sort(new MyComparator());
      
        System.out.println("排序後：");
        String s="";
//      System.out.print(((ArrayList) collection).get(i)+",");
        for (int i = 0; i < collection.size(); i++) {
            s=s+collection.get(i)+",";
        }
        s=s.substring(0,s.length()-1);
        System.out.print(s);
        BigDecimal avg = getAvg(set);
        System.out.println();
        System.out.println("平均數："+avg.toString());
    }

    public static double randDouble() {
        return (Math.random() * 9.0)+1.0;
    }
    public static BigDecimal getAvg(Set<BigDecimal> set){
        ArrayList<BigDecimal> list = new ArrayList<>(set);
        BigDecimal sum=new BigDecimal("0");
        for (int i = 0; i < list.size(); i++) {
            sum=sum.add(list.get(i));
        }
        BigDecimal avg = sum.divide(new BigDecimal(set.size()),5);
        return avg.setScale(3,BigDecimal.ROUND_HALF_UP);
    }

    public static Set<BigDecimal> getSet(int count) {
        int temp=0;
        HashSet<BigDecimal> hashSet = new HashSet<BigDecimal>(count);
        while (temp != count) {
            BigDecimal decimal = new BigDecimal(randDouble());
            if (hashSet.add(decimal.setScale(3, BigDecimal.ROUND_HALF_UP))) {
                temp++;
            }
        }
        return hashSet;
    }
}

class MyComparator implements Comparator<BigDecimal>{
    @Override
    public int compare(BigDecimal o1, BigDecimal o2) {
        double d1 = o1.doubleValue();
        double d2 = o2.doubleValue();
        return -Double.compare(d1,d2);
    }
}

