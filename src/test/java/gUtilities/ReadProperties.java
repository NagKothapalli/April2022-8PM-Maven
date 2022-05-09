package gUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties
{
	String filepath;// null
	public ReadProperties(String myfilepath)
	{
		filepath = myfilepath;
	}
	FileInputStream myfile;
	Properties myprop;
	public String getData(String mykey) //throws IOException   
	{		
		try {
			myfile = new FileInputStream(filepath);
			myprop = new Properties();
			myprop.load(myfile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Checked Exception		
		String myvalue = myprop.getProperty(mykey);
		return myvalue;
	}
}
