/**
 * 
 */
package com.read.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author adminmx
 *
 */
public class DemoReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String fileName = "///home/adminmx/Documentos/CurseJava/test.txt";
		List<String> list = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			list = stream
					.filter(line -> line.endsWith("60:00"))
					.collect(Collectors.toList());
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
		list.forEach(x -> System.out.println("[Start Time],[End Time],[Duration]"+ "\n" + x));
		
	}		
		

	}


