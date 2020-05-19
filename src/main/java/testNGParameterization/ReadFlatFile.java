package testNGParameterization;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFlatFile {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Navaza\\eclipse-workspace\\FirstTestTestNG\\src\\main\\java\\testNGParameterization\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
	}

}
