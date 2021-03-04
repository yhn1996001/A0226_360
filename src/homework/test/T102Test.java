package homework.test;

import org.junit.Test;

import homework.oop.T102Ans;

public class T102Test {

	@Test
	public void printAnsTest() {
		T102Ans t102 = new T102Ans();
		t102.randStart(30);
		t102.printAns();
		t102.randStart(30);
		t102.printAns();
		t102.randStart(30);
		t102.printAns();
		t102.randStart(30);
		t102.printAns();
	}
}
