import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class T102_Sandra{

	public static void main(String[] args){
		Set<BigDecimal> set=new HashSet<BigDecimal>();
		int count=0;
		while(count<6) {
			double temp= (Math.random() *100) +1;
			BigDecimal tempDecimal= new BigDecimal(temp);
			tempDecimal=tempDecimal.setScale(0, BigDecimal.ROUND_DOWN);
			if (set.add(tempDecimal)) {
				count++;
			}
		}
		
		for (BigDecimal temp : set) {
            System.out.println(temp);

            System.out.println(temp.hashCode());
            System.out.println("-----------------");
        }

		
		
		//陣列
		System.out.print("陣列: ");
		BigDecimal sum =new BigDecimal("0");
		BigDecimal avg =new BigDecimal("0");
		
		System.out.print("\n" + "總和： "+ sum);
		System.out.print("\n" + "平均數： "+ avg);
		/**
		//總和，平均數
		double sum = 0; 
		for (int k = 0; k<randomArray.length; k++)
			sum += randomArray[k];
		double avg = sum/randomArray.length;
		BigDecimal sumB = new BigDecimal(sum);
		BigDecimal avgB = new BigDecimal(avg);
		sumB = sumB.setScale(3, BigDecimal.ROUND_DOWN);
		avgB = avgB.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.print("\n" + "總和： "+ sumB);
		System.out.print("\n" + "平均數： "+ avgB);
		
		*/
	}

}


