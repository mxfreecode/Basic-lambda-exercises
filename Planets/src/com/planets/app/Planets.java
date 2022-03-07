package com.planets.app;

import java.util.*;

public class Planets {

	public static void main(String[] args) {
		
		//String[] planet = {"Mercury", "Venus", "Earth"};
		ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mercury","Venus","Mars"));
		
		//The specific implementation
		
		Printable lambdas = () -> System.out.println("Planets: "+ planets);
		printThing(lambdas);
		//printThing(planet);
		//planet.print();
	}

	static void printThing(Printable thing) 
	{
		thing.print();
	}

	
}