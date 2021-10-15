package petStore;

import java.net.HttpURLConnection;
import java.net.URL;


public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetTest pt = new PetTest();
		pt.getPetstore("available");

	}
	String url = "https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available";
	
	public void getPetstore(String status) {
		try {		
			URL url=new URL("https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available");    
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			ResponseBuilder b = new ResponseBuilder();
			System.out.println(b.getFullResponse(huc));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
