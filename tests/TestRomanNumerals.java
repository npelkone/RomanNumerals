import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_convert_to_integer_xx() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("XX"),20);
	}
	
	@Test
	public void test_convert_to_integer_iiii() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("IIII"),0);
	}
	
	@Test
	public void test_convert_to_integer_iv() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("IV"),4);
	}
	
	@Test
	public void test_convert_to_integer_xc() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("XC"),90);
	}
	
	@Test
	public void test_convert_to_integer_cd() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("CD"),400);
	}
	
	@Test
	public void test_convert_to_integer_dccc() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("DCCC"),800);
	}
	
	@Test
	public void test_convert_to_integer_ix() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.convertToInteger("IX"),9);
	}
	
	@Test
	public void test_check_roman_string_i() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.checkRomanNumber("I"),1);
	}
	
	@Test
	public void test_check_roman_string_x() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.checkRomanNumber("X"),10);
	}
	
	@Test
	public void test_check_roman_string_d() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.checkRomanNumber("D"),500);
	}
	
	@Test
	public void test_check_roman_string_m() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.checkRomanNumber("M"),1000);
	}
	
	@Test
	public void test_check_roman_string_xd() {
		RomanNumerals rn = new RomanNumerals();
		assertEquals(rn.checkRomanNumber("XD"),2000);
	}
	
}
