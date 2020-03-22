package MD_ARBAAZ_KHAN.EPAM_Task_on_TDD_and_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest2 {
	
	App obj = new App();
	
	@Test
	void test() {
		
		assertEquals("BCD",obj.checkstring("ABCD"));
	}
	
	@Test
	void test1() {
	
		assertEquals("CD",obj.checkstring("AACD"));
	}
	
	@Test
	void test3() {
		
		assertEquals("BCD",obj.checkstring("BACD"));
	}
	
	@Test
	void test4() {
	
		assertEquals("BBAA",obj.checkstring("BBAA"));
	}
	
	@Test
	void test5() {
		
		assertEquals("BAA",obj.checkstring("AABAA"));
	}
	

		
}
