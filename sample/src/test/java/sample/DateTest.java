package sample;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Test;

public class DateTest {

	@Test
	public void testSimpleDateForma() throws Exception {
		assertEquals("2015/11/19 02:03:04",convert("2015/11/18 26:03:04"));
		
	}
	
	protected String convert(String s) throws Exception{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return formatter.format(formatter.parse(s));
	}

}
