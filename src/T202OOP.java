import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class T202OOP {
	public static void main(String[] args) {
		T202Ans t202Ans=new T202Ans();
		List<BigDecimal> list=t202Ans.getArray(15);
		System.out.println(list);
		System.out.println("總和："+t202Ans.sum);
		System.out.println("平均："+t202Ans.avg);
		new LinkedList<String>();
	}
}


class T202Ans{
//	Set<BigDecimal> set;
	ArrayList<BigDecimal> collection;
	BigDecimal avg;
	BigDecimal sum;
	public T202Ans() {
		this.collection=new ArrayList<BigDecimal>();
		this.avg=new BigDecimal("0");
		this.sum=new BigDecimal("0");
	}
    public List<BigDecimal> getArray(int count) {
        int temp=0;
        
        TreeSet<BigDecimal> treeSet = new TreeSet<BigDecimal>();
        while (temp != count) {
            BigDecimal decimal = new BigDecimal(randDouble());
            decimal=decimal.setScale(3, BigDecimal.ROUND_HALF_UP);
            
            if (treeSet.add(decimal)){
                temp++;
                sum=sum.add(decimal);
            }
        }
        if (false) {
			
		}
        avg=sum.divide(new BigDecimal(treeSet.size()),3,BigDecimal.ROUND_HALF_UP);
        return new ArrayList<BigDecimal>(treeSet);
    }
    public static double randDouble() {
        return (Math.random() * 9.0)+1.0;
    }
	
}