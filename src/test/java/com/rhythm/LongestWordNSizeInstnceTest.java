package com.rhythm;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class LongestWordNSizeInstnceTest {
	LongestWordNSizeInstnce obj;
  @BeforeClass
  public void beforeClass() {
	  obj= new LongestWordNSizeInstnce();
  }

  @AfterClass
  public void afterClass() {
	  obj = null;
  }


  @Test
  public void LongestWordInSentenceTest() {
	  String [] result = {"Gaurav", "6"};
    assertEquals(obj.LongestWordInSentence("I am Gaurav"), result);
  }
  @Test(expectedExceptions = RuntimeException.class)
  public void LongestWordInSentenceTestException() {
	  String str=null;
    assertEquals(obj.LongestWordInSentence(str), "Gaurav");
  }
  @Test
  public void LongestWordInSentenceTest1() {
	  String [] result = {"Raj", "3"};

    assertEquals(obj.LongestWordInSentence("Raj"), result);
  }
  @Test()
  @Parameters({"sentence"})
  
  public void LongestWordInSentenceTestWithParameter(@Optional("")String sentence) {
	  String [] result = {"jumped","6"};
    assertEquals(obj.LongestWordInSentence(sentence), result);
  }
  @Test(enabled=false)
  @Parameters({"sentence"})
  public void LongestWordInSentenceTestIgnore(@Optional("test") String sentence) {
	 
    assertEquals(obj.LongestWordInSentence(sentence), "Parameter");
  }
  @Test()
  @Parameters({"Sentence"})
  //this test case will fail due to wrong parameter name. Handling same in below test
  public void LongestWordInSentenceTestWithParameterFail(@Optional("")String sentence) {
	  String [] result = {"jumped","6"};
    assertEquals(obj.LongestWordInSentence(sentence), result);
  }
  
  @Test(expectedExceptions = RuntimeException.class)
  @Parameters({"Sentence"})
  public void LongestWordInSentenceTestWithWrongParameter(String sentence) {
	  
	  assertEquals(obj.LongestWordInSentence(sentence), "Parameter");
  }
}
