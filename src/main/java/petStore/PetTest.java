package petStore;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;


public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetTest pt = new PetTest();
		pt.getPetstore("available");

	}
	String url = "https://petstore3.swagger.io/api/v3/pet/findByStatus?status=available";
	private CloseableHttpClient client = HttpClientBuilder.create().build();
	
	public void getPetstore(String status) {
		HttpGet postRequest = null;
		try {
			postRequest = new HttpGet("https://petstore3.swagger.io/api/v3/pet/findByStatus?status="+status);
			postRequest.addHeader("accept", "application/xml");
			HttpResponse response = client.execute(postRequest);
			response.getStatusLine();
			System.out.println(response.getStatusLine());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != postRequest) {
				postRequest.releaseConnection();
			}
		}
	}

}
