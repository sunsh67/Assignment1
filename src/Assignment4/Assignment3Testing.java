package Assignment4;


import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import Assignment3.Assignment3;

/*assertEquals(..,output)*/
public class Assignment3Testing {

	private Assignment3 JUTest=new Assignment3();
	private final ByteArrayOutputStream outContent=new ByteArrayOutputStream();
	@Test
	public void testForFindPowerOfThree() {
	
		int[] output=this.JUTest.findPowerOfThree(4);
		int[] result={1,3,9,27};
		assertArrayEquals(result,output);
	}

   @Test
	public void testForCountDigits(){
		assertEquals(1,this.JUTest.countDigits(100));
	}
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}
	
	@Test
	public void testForPrintNumbers(){
		this.JUTest.printNumbers(4);
		assertEquals("0 2 4 6 ", outContent.toString());
		this.outContent.reset();
		this.JUTest.printNumbers(3);
		assertEquals("1 3 5 ", outContent.toString());
		this.outContent.reset();
	}
	
	@Test
	public void testForGeneratePascalsTriangle(){
		int[][]output=this.JUTest.generatePascalsTriangle(5);
		int[]result1={0,0,0,0,1,0,0,0,0};
		int[]result2={0,0,0,1,0,1,0,0,0};
		int[]result3={0,0,1,0,2,0,1,0,0};
		int[]result4={0,1,0,3,0,3,0,1,0};
		int[]result5={1,0,4,0,6,0,4,0,1};
		assertArrayEquals(output[0],result1);
		assertArrayEquals(output[1],result2);
		assertArrayEquals(output[2],result3);
		assertArrayEquals(output[3],result4);
		assertArrayEquals(output[4],result5);
	}
	
	@Test
	public void testForreverseVowels(){
		assertEquals("holle",this.JUTest.reverseVowels("hello"));
	}
	
	@Test
	public void testForLengthOfLastWord(){
		String s="Northeastern University is in Seattle";
		assertEquals(7,this.JUTest.lengthOfLastWord(s));
	}
	
	@Test
	public void testForReverseString2(){
		assertEquals("soccer like I ",this.JUTest.reverseString2("I like soccer"));
	}
	
	@Test
	public void testForCheckMessage(){
		assertEquals(2,this.JUTest.checkMessage("SOSSUSSOP"));
	}
}
