import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class ListTest {

	
	@Test
	public void test() {
		String a="a";
		a.concat("B");
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		int total=1024*6;
		int databeach = 50;
		int[] index;
		index=new int[3];
		index[0]=10;
		index[1]=total/2;
		index[2]=total-10;

		
		ArrayList<Integer> arrayList;
		LinkedList<Integer> linkedList;
		arrayList= new ArrayList<Integer>(total);
		
		System.out.println("arrayList  start-----------------------");
		for (int k = 0; k <total; k++) {
			arrayList.add(k);
		}
		System.out.println("arrayList   end-----------------------");
		
		System.out.println("linkedList  start-----------------------");
		linkedList = new LinkedList<Integer>(arrayList);	
		System.out.println("linkedList   end-----------------------");
		
		for (int i = 0; i < 100; i++) {
			for (int k = 0; k < index.length; k++) {
//				System.out.println(" 索引位置 ="+index[k]);
					insterTest(arrayList, databeach, index[k]);
					selectTest(arrayList,index[k]);
					removeTest(arrayList,index[k]);
					addTest(arrayList,databeach);

					insterTest(linkedList, databeach, index[k]);
					selectTest(linkedList,index[k]);
					removeTest(linkedList,index[k]);
					addTest(linkedList,databeach);
					
					index[1]=arrayList.size()/2;
					index[2]=arrayList.size()-10;
				}

		}
	
	}
	
//	 索引位置確認
	private static String setup(List<Integer> list, int index) {
		final int mid = list.size()/2;
		final int later = list.size()-10;
		String s="";
		if (mid==index) {
			s="mid";
		}
		if (later==index) {
			s="later";
		}
		if (10==index) {
			s="10";
		}
		return s;
	}
	
	private static long addTest(List<Integer> list,int databeach) {
		long start = System.nanoTime(), end;
		for (int i = 0; i < databeach; i++) {
			list.add(i);
		}
		end = System.nanoTime();
		System.out.println("add "+list.getClass().getSimpleName()+" addTest：" + (end - start));
		return (end - start);
	}
	
	private static long insterTest(List<Integer> list, int databeach, int index) {
		String s=setup(list, index);
		
		
		long start = System.nanoTime(), end;
		for (int i = 0; i < databeach; i++) {
			list.set(index, i);
		}
		end = System.nanoTime();
		
		
		System.out.println(s+" "+list.getClass().getSimpleName()+" insterTest：" + (end - start));
		return (end - start);
	}
	private static long selectTest(List<Integer> list, int index) {
		String s=setup(list, index);
		
		long start = System.nanoTime(), end;
		list.get(index);
		end = System.nanoTime();
		System.out.println(s+" "+list.getClass().getSimpleName()+" selectTest：" + (end - start));
		return (end - start);
	}
	private static long removeTest(List<Integer> list, int index) {
		String s=setup(list, index);
		
		long start = System.nanoTime(), end;
		list.remove(index);
		end = System.nanoTime();

		System.out.println(s+" "+list.getClass().getSimpleName()+" removeTest：" + (end - start));
		return (end - start);
		
	}

}
