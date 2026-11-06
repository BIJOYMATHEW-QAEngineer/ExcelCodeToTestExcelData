package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		 
 		String s=ExcelReadCode.readStringData(1, 0,"sheet"); 
 		System.out.println(s); 
 		String s1=ExcelReadCode.readIntegerData(1, 1,"sheet"); 
 		System.out.println(s1); 
	}

}
