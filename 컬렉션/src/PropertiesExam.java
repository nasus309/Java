
import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) throws Exception{
		
		Properties properties = new Properties();
		String path = PropertiesExam.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"utf-8"); //path에 한국어 있을때
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver"); //키로 값을 가져오기
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver: "+driver);
		System.out.println("url: " + url);
		System.out.println("username: "+ username);
		System.out.println("password: " + password);
		
		
		

	}

}
