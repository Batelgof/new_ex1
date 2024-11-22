package ex1_QA_2024.ex1_QA_2024;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {

	
	ex4 tester = new ex4();
	
	

    /**
     * Rigorous Test :-)
     */

    @Test
    public void test_1() {
    	String Expected_result="A";
    	int a=6,b=3;
    	String mod="regular";
    	String actual_result=ex4.Compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    }
    @Test
    public void test_2() {
    	String Expected_result="B";
    	int a=-5,b=-4;
    	String mod="regular";
    	String actual_result=ex4.Compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    }
    
    @Test
    public void test_3() {
    	String Expected_result="A";
    	int a=-3,b=2;
    	String mod="negatives";
    	String actual_result=ex4.Compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    } 
    @Test
    public void test_4() {
    	String Expected_result="A";
    	int a=5,b=5;
    	String mod="negatives";
    	String actual_result=ex4.Compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    } 

    @Test
    public void test_5() {
    	String Expected_result="B";
    	double a=8,b=6;
    	String mod="reciprocals";
    	String actual_result=ex4.Compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    }  
    @Test
    public void test_6() {
    	String Expected_result="B";
    	double a=4,b=0.25;
    	String mod="reciprocals";
    	String actual_result=ex4.Compare(a, b, mod);
    	assertEquals(Expected_result,actual_result);
    }

    
}
