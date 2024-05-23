package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	String path = System.getProperty("user.dir") + "\\Configuration\\global.properties";
	Properties prop;
	FileInputStream fis;

	public String fileReading() throws IOException {
		prop = new Properties();
		fis = new FileInputStream(path);
		prop.load(fis);
		String browser = prop.getProperty("Br");
		return browser;
	}

	public String Url() throws Throwable {
		prop = new Properties();
		fis = new FileInputStream(path);
		prop.load(fis);
		String Url = prop.getProperty("url");
		return Url;
	}
}
