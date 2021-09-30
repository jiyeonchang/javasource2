package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.tools.FileObject;

public class InputStreamEx2 {

	public static void main(String[] args) {

		InputStream in = System.in;
		OutputStream out = System.out;

		FileInputStream fis;
		FileOutputStream fos;

		try {
			int input = in.read();
			out.write(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// finally������ ����� (exception�� �߻��ϵ� ���ϵ�)
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

}
