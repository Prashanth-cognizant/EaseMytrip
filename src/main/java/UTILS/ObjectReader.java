package UTILS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectReader {

	private Properties pro;

    public Properties getPro() {
        return pro;
    }

    public void setPro(Properties pro) {
        this.pro = pro;
    }
    public ObjectReader() throws IOException {
        pro = new Properties();
        FileInputStream fis = new FileInputStream(
        		"C:\\Users\\2479744\\eclipse-workspace\\com.easemytrip.Testing\\src\\main\\resources\\ObjectRepository\\Object.properties"
        );
        pro.load(fis);
    }
    public String getBaseUrl() {
        return pro.getProperty("BaseUrl");
    }
    public String getScreenShotProperty() {
        return pro.getProperty("ScreenShot.path");
    }
}