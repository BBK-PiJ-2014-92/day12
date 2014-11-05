import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

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

	@Test
	public void numberHashTest() {
		Random rand = new Random();
		System.out.println("I will now test 2000 random numbers");
		for (int i = 0; i <= 2000; i++) {
			int hash = rand.nextInt();
			int smallHash = HashUtilities.shortHash(hash);
			assertTrue("Is smallHash less than 1000?", smallHash < 1000);
		}
	}
}