package io;

import java.io.File;

//File :������ �ٷ�� Ŭ���� 
//���� (���丮):/,\ �ü�� ���� �ٸ� 
// �������ô� \t(�̽����������ڷ� �ν��Ҽ������� \\�ΰ� ���δ�)

public class FileEx1 {

	public static void main(String[] args) {
File file = new File("c:\\temp\\test1.txt");
File file2 = new File("c:\\temp","test1.txt");

File file3 = new File("c:\\temp");
File file4 = new File(file3,"test1.txt");

	//�����۾��� 	File file4 = new File(new File("c:\\temp"),"test1.txt");

		
	}

}
