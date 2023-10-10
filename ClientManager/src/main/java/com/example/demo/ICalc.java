package com.example.demo;


public interface ICalc {

	public int op(int a, int b);
	
	
	public default String hello()
	{
		return "hello";
	}
	
	public default String hello2()
	{
		return "hello"; 
	}
}
