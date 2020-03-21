package EPAMHometask.junittdd;
import org.testng.Assert.*;
import org.testng.annotations.*;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class TestPassword {
	
	/* TODO list for my feature
	 * 1. "ABCD" => "BCD" => success
	 * 2. "AACD => "CD => success
	 * 3. "BACD" => "BCD" => success
	 * 4. "BBAA" => "BBAA" => success
	 * 5. "AABAA"=> "BAA" => success*/
	
	
	@Test
	public void TestPasswordLength()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertNotSame(true,pv.isValid("ABCD"));
	}
	public void TestPasswordLength1()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("AACD"));
	}
	public void TestPasswordLength2()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("BACD"));
	}
	public void TestPasswordLength3()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("BBAA"));
	}
	public void TestPasswordLength4()
	{
		PaswordValidator pv = new PaswordValidator();
		Assert.assertEquals(true,pv.isValid("AABAA"));
	}
	
}
