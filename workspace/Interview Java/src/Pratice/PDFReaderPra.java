package Pratice;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PDFReaderPra {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.polyu.edu.hk/iaee/files/pdf-sample.pdf");
		URL url = new URL(driver.getCurrentUrl());
		BufferedInputStream bf = new BufferedInputStream(url.openStream());
		
		 PDFParser pp = new PDFParser((RandomAccessRead) bf);
		 pp.parse();
		 
		 PDFTextStripper pt = new PDFTextStripper();
		String doc= pt.getText(pp.getPDDocument());
		
		
	}

}
