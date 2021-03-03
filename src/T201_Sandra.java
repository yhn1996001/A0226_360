import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class T201_Sandra {

	public static void main(String[] args) throws Exception{
		T201_Sandra ts = new T201_Sandra();
		ts.run(100);
	}

	void run(int max){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<=18; i++)
			map.put(i,0);
		Random random = new Random();
		for (int i = 0; i<max; i++){
			int dice = random.nextInt(18) +1;
			map.put(dice, map.get(dice)+1);
		}
		for (int i = 3; i<=18; i++){
			System.out.printf("%d ", i);
			int n = map.get(i);
			for (int j =0; j<n; j++)
				System.out.print("*");
			System.out.println();
		}
 	}
}