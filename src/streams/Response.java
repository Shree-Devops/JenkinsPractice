package streams;

public class Response {
	String responseBody;
	int statuscode;
	String responseType;
	
	public Response(String responseBody, int statuscode, String responseType) {
		this.responseBody = responseBody;
		this.statuscode = statuscode;
		this.responseType = responseType;
	}
}
