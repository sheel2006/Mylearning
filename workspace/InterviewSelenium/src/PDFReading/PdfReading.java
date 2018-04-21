package PDFReading;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PdfReading {
 public static void main(String[] args) throws Throwable {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("http://www.seleniummaster.com/sitecontent/images/Selenium_Master_Test_Case_Base_Template.pdf");
	 
	 URL url = new URL(driver.getCurrentUrl());//Capture URL
	 BufferedInputStream  bs = new BufferedInputStream(url.openStream());//Read the pdf and store in buffer array
	 
	  //parse()  --  This will parse the stream and populate the COSDocument object.   
	  //COSDocument object --  This is the in-memory representation of the PDF document  
	 PDFParser pp = new PDFParser(bs);  
	 pp.parse();  
	//getPDDocument() -- This will get the PD document that was parsed. When you are done with this document 
	  //you must call    close() on it to release resources  
	  //PDFTextStripper() -- This class will take a pdf document and strip out all of the text and ignore the formatting and           such
	 String output=new PDFTextStripper().getText(pp.getPDDocument());  
	  System.out.println(output);  
	 
	 
	 
	 
	
}
}
