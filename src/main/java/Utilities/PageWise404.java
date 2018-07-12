package Utilities;

import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class PageWise404 {
	static int statusCode;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Filepath = "src/main/resources/drivers/Redirection404.xlsx", Sheetname = "sheet1";
		WebDriver driver = new HtmlUnitDriver();
		Xls_Reader Xls = new Xls_Reader(Filepath);
		driver.get("https://www.ford.com/");
			
		WebElement sitemap = driver.findElement(By.xpath("//body"));
		List<WebElement> alllinks = sitemap.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		String href, title;
		for(int linkCount =0;linkCount < alllinks.size();linkCount++) {
			title = alllinks.get(linkCount).getText();
			href = alllinks.get(linkCount).getAttribute("href");
			//System.out.println(title);
			//System.out.println(href);
			
			statusCode=URLStatus(href);
            
            //System.out.println(statusCode);
            Xls.setCellData(Sheetname, "Title", linkCount+2, title);
            Xls.setCellData(Sheetname, "URL", linkCount+2, href);
            Xls.setCellData(Sheetname, "Status_Code", linkCount+2, String.valueOf(statusCode));
            if (statusCode!= 404) {
            	Xls.setCellData(Sheetname, "Result", linkCount+2, "Working");
            }
            else{
            	Xls.setCellData(Sheetname, "Result", linkCount+2, "Broken");
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
