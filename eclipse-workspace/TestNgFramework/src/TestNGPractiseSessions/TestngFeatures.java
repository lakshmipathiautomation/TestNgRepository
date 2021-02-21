package TestNGPractiseSessions;

import org.testng.annotations.Test;

public class TestngFeatures {
@Test(invocationCount=10)
public void logintest() {
	System.out.println("Executing Logintest");
	
}
@Test(dependsOnMethods="logintest")
public void SearchPage() {
	System.out.println("Executing Searchpage Test");
}
@Test(dependsOnMethods="logintest")
public void Homepage() {
	System.out.println("Executing HomepageTest");
}
@Test(dependsOnMethods="logintest")
public void registration() {
	System.out.println("Executing Registration Test");
}
}
