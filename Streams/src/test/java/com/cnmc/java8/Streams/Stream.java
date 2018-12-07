package com.cnmc.java8.Streams;

import org.junit.Test;

public class Stream {

	@Test
	public void test() {
		Streams app =  new Streams();
		app.filtrar();
	}
	@Test
	public void order() {
		Streams app= new Streams();
		app.ordenar();
		
	}

}
