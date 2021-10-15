package petStore;

import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.json.simple.JSONObject;



public class PetTest {
	
	private HttpClient client = HttpClientBuilder.create().build();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetTest pt = new PetTest();
		pt.AddPet();
		pt.getPetstore("available");

	}
	String url = "https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available";
	
	public void getPetstore(String status) {
		try {		
			URL url=new URL("https://petstore3.swagger.io/api/v3/pet/findByStatus?status="+status);    
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			ResponseBuilder b = new ResponseBuilder();
			String Response = b.getFullResponse(huc);
			boolean isPresent = Response.contains("LekhasPet");
			
			System.out.println("LekhasPet found in available pet list");
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
			method.setEntity(new StringEntity(createJson()));
			
			HttpResponse httpResponse = client.execute(method);
			int statusCode = httpResponse.getStatusLine().getStatusCode();
			System.out.println(statusCode);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@SuppressWarnings("unchecked")
	public String createJson() {
		JSONObject json = new JSONObject();

		json.put("id", "20");
		json.put("name", "LekhasPet");
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("id", 1);
		jsonObj.put("name", "Dogs");
		json.put("category", jsonObj);
		json.put("status", "available");
		return json.toString();
		
	}
}
