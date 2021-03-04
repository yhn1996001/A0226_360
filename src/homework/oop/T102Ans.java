package homework.oop;

import java.math.BigDecimal;
import java.util.*;

public class T102Ans {

	Set<BigDecimal> ansSet;
	BigDecimal sum, avg;
	
//	骰子最小值、最大值
	int mintValue, maxtValue;
//	小數保留位數
	int decimalPlaces;
	
//  建構元、建構子、  Contructor 構造方法
	public T102Ans() {
		ansSet = new TreeSet<BigDecimal>();

		maxtValue = 10;
		mintValue = 1;
		decimalPlaces=3;
	}
	
	void reset() {
		ansSet.clear();
		sum=BigDecimal.ZERO;
		avg=BigDecimal.ZERO;
	}

//	預設投擲15次
	public void randStart() {
		randStart(15);
	}

//  自訂投擲次數
	public void randStart(int elementCount) {
		reset();
		int count = 0;
		while (count != elementCount) {

//          判斷浮點數是否加入成功，成功加入表示不重複，反之重複
			if (ansSet.add(getRandValue())) {
//              計算加總
				sum = sum.add(getRandValue());
//              計算成功生成浮點數
				count++;
			}
		}
		avg = sum.divide(new BigDecimal(count), decimalPlaces, BigDecimal.ROUND_DOWN);
	}
	
	private BigDecimal getRandValue() {
		
		double tempValue = (Math.random() * (maxtValue - mintValue)) + mintValue;
		BigDecimal bigDecimal = new BigDecimal(tempValue);
		
		return bigDecimal.setScale(decimalPlaces, BigDecimal.ROUND_DOWN);
	}

	public void printAns() {
//      輸出結果
		System.out.print("陣列：");
		System.out.println(ansSet.toString());
		System.out.println("個數：" + ansSet.size());
		System.out.println("總和：" + sum);
		System.out.println("平均數：" + avg);
		System.out.println("");
	}

}
