package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
//���� ��ȯ ���� ��Ʈ��
//����Ʈ ��� ��Ʈ�� => Reader or Writer �� ��ȯ�ؼ� ��� 
//���ڵ� ��� ���� ���� �ϱ� ������ �ѱ��� �����ų� �ϴ°� ������ �� �ִ� (utf-8,ms949,euc-kr,ascii....)

	public static void main(String[] args) {

		// �޸��� ���� ����� utf-8�� �Ǿ� �־ ���Ͽ� �� �� ������ ������� �ؿ�
		// �׸��� ���� ������ ���ϵ��� ȭ������� �о���� ������ ��Ȳ�� �¾ƿ�...���ڵ��� �� �¾ұ� ������
		// ���ݰ��� ��Ȳ�� ������ InputStreamReader �� ���°Ű�
		// ��Ŭ���� ��ũ �����̽� ���ڵ��� utf-8�� ���系�� �ѱ��� �� �����µ�
		// ���� ��Ŭ���� ��ũ �����̽� ���ڵ��� �ٲٸ� �̶����� �۾��ߴ� �ּ� �޾Ƴ��� �ѱ��� ��� ������
		// �׷��� ���߿� ���� ���� �� �� ��ũ �����̽� �����ϸ鼭 �ѱ� ���ڵ� ��� �ٲܰſ���...

		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("c:\\temp\\file2.txt"), "utf8");
				FileWriter writer = new FileWriter("c:\\temp\\test3.txt")) {

			char cbuf[] = new char[100];
			while (reader.read(cbuf) != -1) {
				writer.write(cbuf);
				System.out.println(cbuf); // InputStreamReader �� �о�;� ȭ�� ����� �ɾ��� ���� �� ������(���ݼ�������?)
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
