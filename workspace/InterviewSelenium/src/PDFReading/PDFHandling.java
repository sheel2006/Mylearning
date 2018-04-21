package PDFReading;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		PDDocument pd;
		pd=PDDocument.load(new File("D:\\HANDA, Sheel Kumar - I-129 RN.pdf"));
		
		System.out.println(pd.getNumberOfPages());
		
		PDFTextStripper pdf =new PDFTextStripper();
		
		System.out.println(pdf.getText(pd));

	}

}
