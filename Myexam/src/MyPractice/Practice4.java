package MyPractice;
//9.1�������� 
import java.io.IOException;

//while,boolean

public class Practice4 {

	public static void main(String[] args)throws IOException {

		boolean run = true;
		int keycord = 0, speed = 0;

		while (run) {
			if (keycord != 13 && keycord != 10) {
				System.out.println("===========");
				System.out.println("1���� | 2���� |3����");
				System.out.println("===========");
				System.out.println("���� : ");

			}
			keycord = System.in.read();

			if (keycord == 49) {
				System.out.println("����ӵ� = " + speed);
			} else if (keycord == 50) {
				speed--;
				System.out.println("����ӵ� " + speed);
			} else if (keycord == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}