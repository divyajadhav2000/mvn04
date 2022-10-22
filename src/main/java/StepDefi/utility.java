package StepDefi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utility {
 public Properties comprop;
 public Properties conprop;
	
	utility(){
		try {
			File elefile = new File("C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\contact.properties");
			FileInputStream filein = new FileInputStream(elefile);
			  conprop = new Properties();
			
			File elefile1 = new File("C:\\Users\\jadha\\eclipse-workspace\\Maven\\MVNPractice1\\mvn04\\src\\main\\java\\company.properties");
			FileInputStream filein1 = new FileInputStream(elefile1);
			comprop = new Properties();
			
			
			conprop.load(filein);
			comprop.load(filein1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void util1() {
		
	}
	
	public String util(String element, String page) throws IOException{
		String elexpath="";
		
		
		switch(page) {
		case "contact":
			elexpath=conprop.getProperty(element);
			break;
		
		case "company":
			elexpath=conprop.getProperty(element);
			break;
			
		}
		
		return elexpath;
		}
}
