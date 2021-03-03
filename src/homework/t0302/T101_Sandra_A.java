package homework.t0302;
public class T101_Sandra_A {

	/*
	*	基本上沒有問題
	* 	但是建議可以使用陣列
	* */

	public static void main(String[] args){
		int t, d_1 = 0,d_2 = 0,d_3 = 0,d_4 = 0,d_5 = 0,d_6 = 0;
		for (int i = 1; i<=20; i++){
			t = (int) (1+Math.random()*6);
			switch(t){
				case 1:
					d_1++;
					break;
				case 2:
					d_2++;
					break;
				case 3:
					d_3++;
					break;
				case 4:
					d_4++;
					break;
				case 5:
					d_5++;
					break;
				case 6:
					d_6++;
					break;
			}
		}
		System.out.println("執行結束，列出結果為：");
		System.out.println("1:" + d_1 +"次");
		System.out.println("2:" + d_2 +"次");
		System.out.println("3:" + d_3 +"次");
		System.out.println("4:" + d_4 +"次");
		System.out.println("5:" + d_5 +"次");
		System.out.println("6:" + d_6 +"次");
	}
}