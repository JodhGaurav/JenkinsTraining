package Utilities;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

public class BrokenLinks {
	public static String Filepath = "testOutput/UrlWiseCheck404.xlsx";
	public static WebDriver driver;
	static Response response;
	static int statusCode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new HtmlUnitDriver();
		Xls_Reader Xls = new Xls_Reader(Filepath);
		System.out.println(Xls.getRowCount("sheet1"));
		for(int i=2; i<=Xls.getRowCount("sheet1"); i++)
		{	
		String URL= Xls.getCellData("sheet1", "Source_Url", i);
		//driver.get(URL);
		statusCode=URLStatus(URL);
		Xls.setCellData("301 Redirection", "Status_Code", i, String.valueOf(statusCode));
			if (statusCode!= 404)
			{
				Xls.setCellData("sheet1", "Result", i, "Working");
				
			}
			else
			{
				Xls.setCellData("sheet1", "Result", i, "Broken");
			}
		}
	}
	
	public static int URLStatus(String URL) {
		int res = 0;
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		try {
			HttpResponse response = client.execute(request);
			res=response.getStatusLine().getStatusCode();
			} catch (Exception e) {
			e.printStackTrace();
			}
		return res;
	}


}
