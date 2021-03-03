package homework.t0302;
import java.util.HashMap;
import java.util.Map;

public class Human{
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eye;
		result = prime * result + hand;
		result = prime * result + head;
		result = prime * result + lag;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (eye != other.eye)
			return false;
		if (hand != other.hand)
			return false;
		if (head != other.head)
			return false;
		if (lag != other.lag)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	//	資料成員 欄位 屬性
//  類別方法、類別變數(靜態變數)
	int eye;
	int lag;
	int hand;
	int head;
	String name;
	
	public void sleep() {
		System.out.println(name+"睡覺");
	}
	public void eat() {
		System.out.println(name+"吃飯");
	}
	
	@Override
	public String toString() {
		return "[eye=" + eye + ", lag=" + lag + ", hand=" + hand + ", head=" + head + ", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
		
		Map<String,Human>map=new HashMap<String, Human>();
		Human san=new Human();
		
		Integer ii=new Integer(5);
		int i=5;
		
		san.eye=2;
		san.lag=2;
		san.hand=2;
		san.head=1;
		san.name="san";
		
		san.sleep();
		
		Human may=new Human(); 
		may.eye=2;
		may.lag=2;
		may.hand=2;
		may.head=1;
		may.name="san";
		
		System.out.println("san"+san);
		System.out.println("may"+may);
// map  K= tom , V = tom 
		map.put("tom", san);
//		請問現在 san等於map.get("tom")
		System.out.println(san==map.get("tom"));
//		請問 map.get("tom").name 是甚麼名稱?
		System.out.println(map.get("tom").name);
	}
} 