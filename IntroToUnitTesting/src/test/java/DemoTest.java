/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class DemoTest {
	
	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_tiangle_2() {
		assertTrue(Demo.isTriangle(5,12, 13));
	}
	
	@Test
	public void test_is_tiangle_3() {
		assertTrue(Demo.isTriangle(5,13, 12));
	}
	
	@Test
	public void test_is_tiangle_4() {
		assertTrue(Demo.isTriangle(12 ,5, 13));
	}
	
	@Test
	public void test_is__NOT_tiangle_1() {
		assertFalse(Demo.isTriangle(5 ,13, 7));
	}

	
	@Test
	public void test_is__NOT_tiangle_2() {
		assertFalse(Demo.isTriangle(5 ,7, 13));
	}
	
	@Test
	public void test_is__NOT_tiangle_3() {
		assertFalse(Demo.isTriangle(13 ,5, 7));
	}
	
	@Test
	public void test_is__NOT_tiangle_4() {
		assertFalse(Demo.isTriangle(13 ,7, 5));
	}
	
	@Test
	public void test_is__NOT_tiangle_5() {
		assertFalse(Demo.isTriangle(14 ,7, 5));
	}
	
	@Test
	public void test_is__NOT_tiangle_6() {
		assertFalse(Demo.isTriangle(5 ,9, 3));
	}
	
	@Test
	public void test_is__NOT_tiangle_7() {
		assertFalse(Demo.isTriangle(1 ,2, -1));
	}
	
	@Test
	public void test_main_program1() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("5\n12\n13\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program2() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("3\n4\n5\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program3() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("5\n12\n13\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program4() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("5\n13\n12\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program5() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("12\n5\n13\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program6() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("5\n13\n7\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is not a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program7() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("7\n13\n5\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is not a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
	@Test
	public void test_main_program8() {
		ByteArrayInputStream in = 
				new ByteArrayInputStream("13\n5\n7\n".getBytes());
		System.setIn(in);
	
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String[] args = {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
	consoleOutput += "Enter side 2: "       + System.getProperty("line.separator");
	consoleOutput += "Enter side 3: "       + System.getProperty("line.separator");
	consoleOutput += "This is not a triangle."  + System.getProperty("line.separator");
	
	assertEquals(consoleOutput, out.toString());
	
	}
	
}
