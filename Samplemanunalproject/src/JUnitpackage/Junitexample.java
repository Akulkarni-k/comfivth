package JUnitpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class Junitexample {

@Before
public void setup() throws Exception{
	
}
@After
public void tearDown() throws Exception{
	
}
@Test
public void test()
{
	fail("not yet implimatnted");
}
@Test
public void test_JUnit() {
    System.out.println("This is the testcase in this class");
    String str1="This is the testcase in this class";
    assertEquals("This is the testcase in this class", str1);
}
}

