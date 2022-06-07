package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * this class contains methods which is used to read the data from property file
 * @author mrinm
 *
 */
public class FileUtility {

	/**
	 * this method is used to read the data from common.properties file which contains values required for test scripts
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstants.PROPERTYFILE_PATH);
		Properties pobj= new Properties();
		pobj.load(fis);
		String value= pobj.getProperty(key);
		return value;
	}
}
