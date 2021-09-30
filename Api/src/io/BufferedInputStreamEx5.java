package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx5 {

	public static void main(String[] args) {
//FileInputStream�� ����ϴ� ���+byte�迭 ��� 
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3")) {
			long start = System.currentTimeMillis();
			byte data[ ]= new byte[1024];
			
			while (fis.read(data) != -1) {

			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream +FileOutputStream +byte�迭 ���� " + (end - start));

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//FileInputStream + BufferedInputStream +FileOutputStream+BufferedOutputStream +byte�迭 ����ϴ� ���
		
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
						FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3");
								BufferedOutputStream bos =new BufferedOutputStream(fos)){
			long start =System.currentTimeMillis();
			byte data[ ]= new byte[1024];
			while(bis.read(data)!=-1) {}
			
			
			bos.flush();
long end = System.currentTimeMillis();
System.out.println("FileInputStream + BufferedInputStream ����ϴ� ���"+(end-start));
		
		
		} catch (Exception e) {

		e.printStackTrace();
		}
		


	}

}
