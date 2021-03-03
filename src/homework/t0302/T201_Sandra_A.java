package homework.t0302;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class T201_Sandra_A {

	public static void main(String[] args) throws Exception{
		T201_Sandra_A ts = new T201_Sandra_A();
		ts.run(100);
	}

	void run(int max){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =3; i<=18; i++)
			map.put(i,0);

		for (int i = 0; i<max; i++){
			int dice1 = randomInt(6);
			int dice2 = randomInt(6);
			int dice3 = randomInt(6);
			int sum = dice1 + dice2 + dice3;
			map.put(sum, map.get(sum)+1);
		}
		for (int i = 3; i<=18; i++){
			System.out.printf("%d ", i);
			int n = map.get(i);
			for (int j =0; j<n; j++)
				System.out.print("*");
			System.out.println();
		}
 	}
 	int randomInt(int bound ){
		Random random = new Random();
		int i = random.nextInt(bound) + 1;
		return i ;
	}
}