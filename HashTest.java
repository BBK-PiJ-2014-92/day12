import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {

	@Test
	public void stringHashTest() {
		System.out.println("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
		assertTrue("Is smallHash less than 1000?", smallHash < 1000);
	}

}