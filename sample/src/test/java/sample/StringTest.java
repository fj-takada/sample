package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testString() {
		assertEquals("hoge", "ho" + "ge");
	}

}
