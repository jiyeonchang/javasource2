package io;

import java.io.File;

//File :������ �ٷ�� Ŭ���� 

public class FileEx2 {

	public static void main(String[] args) {
File file = new File("c:\\temp\\inputStream1.java");
		
//�����̸� 

String fileName = file.getName();

System.out.println("���ϸ� "+fileName);
int p = fileName.lastIndexOf(".");
//���� ���ϸ� ������������� 
//.��ġ ã�� 
System.out.println("Ȯ���� ������ ���ϸ� "+fileName.substring(0,p));
System.out.println("Ȯ����  "+fileName.substring(p+1));//(+1��������).�������� 

//��θ� ������ ���ϸ� 
System.out.println("��θ� ������ ���ϸ� "+ file.getPath());
System.out.println("������ �����ִ� ������ "+ file.getParent());

System.out.println("File.separator : "+ File.separator); 
System.out.println("File.pathSeparator : "+ File.pathSeparator); 


	}

}
