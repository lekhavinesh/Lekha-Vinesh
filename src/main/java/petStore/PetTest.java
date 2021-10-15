package petStore;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.http.client.methods.HttpPost;
import org.json.simple.JSONObject;


public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetTest pt = new PetTest();
		pt.getPetstore("available");
		pt.createJson();

	}
	String url = "https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available";
	
	public void getPetstore(String status) {
		try {		
			URL url=new URL("https://petstore3.swagger.io/api/v3/pet/findByStatus?status="+status);    
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			ResponseBuilder b = new ResponseBuilder();
			System.out.println(b.getFullResponse(huc));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void AddPet() {
		HttpPost method = null;
		try {
			method = new HttpPost("https://petstore3.swagger.io/api/v3/pet");
			method.addHeader("accept","application/xml");
			method.addHeader("Content-Type","application/json");
			method.setEntity(null);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public JSONObject createJson() {
		String message;
		JSONObject json = new JSONObject();

		json.put("id", "20");
		json.put("name", "pinkuss");
		
		JSONObject jsonObj = new JSONObject();

		jsonObj.put("id", 0);
		jsonObj.put("name", "testName");
		json.put("category", jsonObj);

		message = json.toString();
		System.out.println(message);
		return json;
	}
}
