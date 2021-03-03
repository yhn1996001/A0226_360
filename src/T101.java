
import java.util.HashMap;
import java.util.Map;

/**
 * 0227 改過
 * 以Map 物件實作

 */
public class T101 {
	
	static Map<Integer,Integer> map=new HashMap<Integer, Integer>() ;
	static int forloopRage;
	static int diceNumber=6 ;

	
	public static void main(String[] args) {
    	  
		System.out.println("Hello 你好");
    	restart();
        playDice(forloopRage);
    	printAns();
		
	
    }
 
//  初始化資料
    private static void restart() {
		forloopRage = 20;
		diceNumber =6 ;
		for (int i = 1; i <= diceNumber; i++) {
    		map.put(i, 0);    			    		
		}	
	}
// 執行骰子點數總和
	private static void playDice(int forloopRang2) {
		
		int tempValue=0;
    	int oldValue=0;
		for (int i = 0; i < forloopRang2; i++) {
    		
			tempValue=randInt();
			oldValue = map.get(tempValue);
			map.put(tempValue,oldValue+1);
   		}	
	}
// 模擬丟骰子
	public static int randInt(){
        return (int)((Math.random() * diceNumber) + 1);
    }
// 列印答案
	private static void printAns() {
    	for (Map.Entry<Integer,Integer> ecttry : map.entrySet()) {
			System.out.println(ecttry.getKey()+"："+ecttry.getValue()+"次");    		
		} 
	}   
}
