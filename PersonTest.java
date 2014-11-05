import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}

	@Test
	public void testWrittenName() {
		Person p = new Person();
		System.out.println("Please enter your full name");
		String input = System.console().readLine();
		String output = p.getInitials(input);
		String expected = "HIIMYLF";
		assertEquals(output, expected);
	}

	@Test
	public void testTwoSpace() {
		Person p = new Person();
		String input = "Foxtrot Uniform Charlie  Kilo";
		String output = p.getInitials(input);
		String expected = "FUCK";
		assertEquals(output, expected);
	}

	@Test
	public void testThreeSpace() {
		Person p = new Person();
		String input = "Hello   is it me you're looking for";
		String output = p.getInitials(input);
		String expected = "HIIMYLF";
		assertEquals(output, expected);
	}
}