package io;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderEx1 {
	/*ó���� ������ ���ڶ�� Reader,Writer�� ���� 
	 * char���·� ó�� 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		try(Reader reader = new FileReader("c:\\temp\\file2.txt")) {
			char[] cbuf = new char[100];
			int readcharNo;//������ ������ ������ ���� �˷��� 
			
			while((readcharNo = reader.read(cbuf))!=-1) {
				System.out.println(cbuf);
			}
			
		} catch (Exception e) {

		e.printStackTrace();
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
