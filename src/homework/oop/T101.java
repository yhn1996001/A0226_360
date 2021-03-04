package homework.oop;

import java.util.HashMap;
import java.util.Map;

public class T101 {

	Map<Integer, Integer> map;
	Integer forloopRage;
	Integer diceNumber ;

	public T101() {
		this(6);
	}	

	public T101(int diceNumber) {
		super();
		map=new HashMap<Integer, Integer>();
		this.forloopRage=20;
		this.diceNumber = diceNumber;
	}

//  初始化資料
	private void restart() {
		
	}
	public void playDice() {
		playDice(forloopRage);
	}
// 執行骰子點數總和
	public void playDice(int forloopRang2) {

		int tempValue = 0;
		int oldValue = 0;
		for (int i = 0; i < forloopRang2; i++) {

			tempValue = randInt();
			if (map.get(tempValue)==null) {
				map.put(tempValue, 1);
			}
			oldValue=map.get(tempValue);
			map.put(tempValue, oldValue + 1);
		}
	}

// 模擬丟骰子
	public Integer randInt() {
		int i=(int) ((Math.random() * diceNumber) + 1);
		return new Integer(i);
	}

// 列印答案
	public void printAns() {
		for (Map.Entry<Integer, Integer> ecttry : map.entrySet()) {
			System.out.println(ecttry.getKey() + "：" + ecttry.getValue() + "次");
		}
	}
}
