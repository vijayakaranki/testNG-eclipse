package testNGParameterization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Navaza\\Desktop\\textFile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String i="";
		while((i=br.readLine())!=null)
		{
		System.out.println(i+"\n");
		}
		br.close();
		System.out.println("reading done!");
	}

}
