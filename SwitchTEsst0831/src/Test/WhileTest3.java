package Test;//126����

import java.io.IOException;

public class WhileTest3 {

	public static void main(String[] args) throws IOException {

boolean run = true ;
 int keycode = 0 ,speed = 0 ;

 while(run) {//()�ȿ� true �� �ְ� �����ص� ���ư��� �ᱹ �ȿ����� true���� false���� �Ǵ��ϱ� ����
	 if (keycode!=13&& keycode !=10 ) {//13-> CR�� ����, ���� �� ó������ ���ư��� ������ �ϸ�
//		 && ->LF :���� 
	 System.out.println("=============");
	 System.out.println("1. ���� | 2. ���� | 3. ���� ");
	 System.out.println("=============");
	 System.out.println("����");
	 }
	 keycode =System.in.read();//1�������� ������ 49�� ���ƿ�(��������)
	 if(keycode ==49) {//�ƽ�Ű�ڵ�ǥ
		 speed++;
		 System.out.println("����ӵ� ="+speed);
		 }else if (keycode ==50) {
			 speed--;
			 System.out.println("����ӵ� ="+speed);
		 }else if (keycode==51) {
			 run = false; 
		 }
 } 
 System.out.println("���α׷� ����");
		 
		 
		 
	 
run =false; 

}

}
