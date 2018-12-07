package com.cnmc.java8.Streams;

import java.util.stream.IntStream;

import org.junit.Test;

public class PrincipalTest {

	@Test
	public void test() {
		long numero1=System.currentTimeMillis();
        
        IntStream lista= IntStream.range(1, 10);
        int total=lista.parallel().map(Principal::duplicar).sum(); 
        long numero2=System.currentTimeMillis();
        System.out.println(numero2-numero1);
        System.out.println(total);      
	}

}
