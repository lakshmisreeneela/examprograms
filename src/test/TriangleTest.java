package test;

import static org.junit.Assert.*;

import org.junit.Test;

import program.Triangle;

public class TriangleTest {

	@Test
	public void test() {
		Triangle triangle=new Triangle(4,5,6);
		//boolean result=triangle.isTriangle();
		double angle=triangle.getAngle(4);
	assertEquals(41.40962210927086, angle,0);
		
		
	}
	@Test
	public void Test5() {
		Triangle triangle=new Triangle(17,17,30);
		//boolean result=triangle.isTriangle();
		double angle=triangle.getAngle(17);
	assertEquals(28.07248693585296, angle,0);
		
		
	}
	@Test
	public void negativeValuesTest() {
		Triangle triangle=new Triangle(-150,30,130);
		boolean result=triangle.isTriangle();
		assertEquals(false,result);
		
	}
	@Test
	public void invalidEdge() {
		Triangle triangle=new Triangle(17,17,30);
		//boolean result=triangle.isTriangle();
		double angle=triangle.getAngle(10);
	assertEquals(0, angle,0);
		
		
	}

}
