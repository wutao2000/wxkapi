package com.wxk.cn;


import org.testng.annotations.Test;

public class TestApi {
    @Test
    
    public static void TestApi(){
    	
    	System.out.println("one----test/java/TestApi");
    	
    }
    @Test
    public static void T2(){
    	System.out.println("wto----T2");
    }
    
    @Test
    public static void T3(){
    	System.out.println("wto----T3");
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("9090909");
        
        System.out.println(true);
        
        TestApi();
        TestApi.TestApi();
        
        TestApi TT= new TestApi();
        T2();
        
	}
	

}
