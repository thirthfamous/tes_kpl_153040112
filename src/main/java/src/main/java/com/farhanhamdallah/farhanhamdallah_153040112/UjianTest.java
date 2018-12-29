package src.main.java.com.farhanhamdallah.farhanhamdallah_153040112;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UjianTest {

	@Test
	public void test1() {
		A a = new A();
		assertEquals(25.0, a.hitung(2, 3, 5), 0.0);
	}
	
	@Test
	public void test2() {
		A a = new A();
		assertEquals(5.6, a.hitung(2.1, 3.5, 1.0), 0.0);
	}

}
