package testNGParameterization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Navaza\\Desktop\\textFile.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("this is string");
		bw.newLine();
		bw.write("13");
		bw.newLine();
		bw.write('b');
		bw.newLine();
		bw.close();
		File f1=new File("C:\\Users\\Navaza\\Desktop\\textFile.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		String i="";
		while((i=br.readLine())!=null)
		System.out.println(i);
		br.close();
	}

}
