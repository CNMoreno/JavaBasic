package com.cnmc.java8.Streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {

	
	private List<String> lista;
	private List<String> numeros;
	
	public Streams() {
		lista = new ArrayList<>();
		lista.add("Federica");
		lista.add("Betty");
		lista.add("Andrea");
		lista.add("Marta");
		lista.add("Cecilia");
		
		numeros = new ArrayList<>();
		numeros.add("5");
		numeros.add("4");
		numeros.add("3");
		numeros.add("2");
		numeros.add("1");
	}
	public void filtrar() {
	lista.stream().filter(x-> x.startsWith("M")).forEach(System.out::println);	
		
	}
	public void ordenar() {
		lista.stream().sorted().forEach(System.out::println);
		
	}
	public static void main(String[] args) {
		Streams app =  new Streams();
		app.ordenar();
		
	}
}
