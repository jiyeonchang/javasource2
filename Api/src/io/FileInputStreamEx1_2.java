package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1_2 {
	public static void main(String[] args) {
//		InputStream in=null;
//		OutputStream out = System.out;
//		
//		byte[] datas = new byte[100];
//		try {
//			 in = new FileInputStream("c:\\temp\\file1.txt");
//			 
//			 while(in.read(datas)!=-1) {
//				 out.write(datas);
//			 }			 
//		} catch (FileNotFoundException  e) {			
//			e.printStackTrace();
//		} catch (IOException e) {		
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {				
//				e.printStackTrace();
//			}
//		}

		//try-with-resources(jdk 7버전 부터 생김 ):자동으로 자원해제
		try(InputStream in=new FileInputStream("c:\\temp\\file1.txt");
				OutputStream out = System.out;) {
			
			byte[] datas = new byte[100];
			
			 while(in.read(datas)!=-1) {
				 out.write(datas);
			 }			 
			
			
			
		} catch (Exception e) {

		e.printStackTrace();
		}
		
		
		
		
	}
}
