package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {

		InputStream in = System.in;
		OutputStream out =System.out;
		
		byte [] datas = new byte[100];
		
		//����ڷκ��� �����͸� �̸��� �ϰ���� ���� �Է¹��� �Ŀ� 
		//String ��ü�� ��ȯ 
		
		System.out.print("�̸� : ");
		try {
			int nameBytes = in.read(datas);//ȫ�浿 ���� ġ�� ���Ͱ����� ���� �� 
			String name = new  String(datas, 0, nameBytes-2);//-2�� ���Ͱ� �� 
			//Enter : carriage return => 13�� , line feed : 10 �� //�ΰ��� ����Ʈ�� ����Ǿ��ֱ� ������ -2�� 
			//���ܹ߻��ϴ� �ڵ� ������� 
			System.out.println("�ϰ� ���� �� :");
			int commentsByte = in.read(datas);
			String comment = new String(datas, 0, commentsByte-2);
			
			System.out.println("�Է��� �̸� "+ name);
			System.out.println("�Է��� �ϰ� ���� �� "+ comment);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				in.close();
				out.close();
			} catch ( Exception e2) {

			  e2.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
