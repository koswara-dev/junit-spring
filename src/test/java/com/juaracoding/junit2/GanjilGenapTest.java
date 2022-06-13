package com.juaracoding.junit2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.juaracoding.junit2.ganjilgenap.JalurGanjilGenap;

public class GanjilGenapTest {

	JalurGanjilGenap jalurGanjilGenap;
	
	@Before
	public void setUp() {
		jalurGanjilGenap = new JalurGanjilGenap();
	}
	
	@Test
	public void testDiizinkan1() {
		String expect = "Diizinkan";
		String actual = jalurGanjilGenap.cekJalurGanjilGenap(12, 1234);
		assertEquals(expect, actual);
	}
	
	@Test
	public void testDilarang1() {
		String expect = "Dilarang";
		String actual = jalurGanjilGenap.cekJalurGanjilGenap(12, 1235);
		assertEquals(expect, actual);
	}
	
	@Test
	public void testDiizinkan2() {
		String expect = "Diizinkan";
		String actual = jalurGanjilGenap.cekJalurGanjilGenap(13, 1235);
		assertEquals(expect, actual);
	}
	
	@Test
	public void testDilarang2() {
		String expect = "Dilarang";
		String actual = jalurGanjilGenap.cekJalurGanjilGenap(13, 1234);
		assertEquals(expect, actual);
	}
	
}
