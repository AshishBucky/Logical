package junitbasic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2Test {

	@Test
	void test() {
		Test2 test=new Test2();
		int excepted=5;
		int actual=test.count("india");
		assertEquals(excepted, actual);
	}
	@Test
	void test1() {
		Test2 test=new Test2();
		int excepted=7;
		int actual=test.count("Priynka");
		assertEquals(excepted, actual,"This method will give 7");
	}


}
