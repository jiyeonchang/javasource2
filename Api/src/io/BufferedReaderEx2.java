package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class BufferedReaderEx2 {

	public static void main(String[] args) {
//BufferedInputStreamEx5 ������ �о ȭ�鿡 �ٹ�ȣ�� �Բ� ���
 
//FileReader("src/io/BufferedInputStreamEx5.java")
	
		
		try (FileReader fr = new FileReader("src/io/BufferedInputStreamEx5.java");
				BufferedReader br = new BufferedReader(fr)){ 
			int i= 1;
	String line = "";		
			while((line=br.readLine())!=null) {
				System.out.println(i+""+line);
				i++;
			}
			
		} catch (Exception e) {
e.printStackTrace();
		
	}

	}
}

