package practiceTestNG;

import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SkipTestInTestNG {
	@Test(enabled = true)
	@Parameters({"UserName","PassWord"}) 
	public void testcase1(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("Testcase 1 -  executed");
	}

	@Test(enabled = false)
	public void testcase2() {
		System.out.println("Testcase 2 - Executed");
		//throw new SkipException("Skipping this exception");
	}

	@Test(enabled = true)
	public void testcase3() {
		boolean DataAvailable = false;
		System.out.println("Test Case3 - Executed");
		if (!DataAvailable)
			throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}

}
