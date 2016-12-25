package jp.co.junit4.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void returnFizz() {
		// 3の倍数かを検証
		assertEquals("失敗", "Fizz", FizzBuzz.fizzBuzz(3));
		assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
		assertEquals("Fizz", FizzBuzz.fizzBuzz(12));
	}

	public void returnBuzz() {
		// 5の倍数
		assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
		assertEquals("Buzz", FizzBuzz.fizzBuzz(40));
		assertEquals("Buzz", FizzBuzz.fizzBuzz(80));
	}

	public void returnFizzBuzz() {
		// 15の倍数
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
		assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(95));
	}

	public void returnNum() {
		// それ以外の倍数
		assertEquals(7, FizzBuzz.fizzBuzz(7));
		assertEquals(14, FizzBuzz.fizzBuzz(14));
		assertEquals(21, FizzBuzz.fizzBuzz(21));
	}

}