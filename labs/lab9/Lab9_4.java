package area;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Lab9_4 {
	 static void replaceTextFile(String filename,String target,String replace,String toFileName ) throws IOException {
		Path path = Paths.get(filename);
		Path toPath= Paths.get(filename);
		Charset charset= Charset.forName("UTF-8"); 
		BufferedWriter writer = Files.newBufferedWriter(toPath, charset);
		Scanner scan = new Scanner(path, charset.name());
		
		while (scan.hasNextLine()) {
			String line= scan.nextLine();
			line = line.replaceAll(target, replace);
			writer.write(line);
			writer.newLine();
		
	}
		scan.close();
		writer.close();
	 }
	public static void main (String[] args) throws IOException  {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string you want to target");
		String target= in.next(); // this is the string you want to remove
		System.out.println("Enter what you want to replace the string with");
		String replace= in.next();
		
		
		
		//replaceTextFile("c\\Users\\ashishjoshi\\Desktop\\cmpt220Joshi\\labs\\lab9\\Tree.txt",
		//		"Write", "Read", "d\\Users\\ashishjoshi\\Desktop\\cmpt220Joshi\\labs\\lab9\\Tree.txt" );
	//this is where you input the text file location
		
	}
	}


