package Test;

public class SwitchTest02 {

	public static void main(String[] args) {
 char grade= 'B';
//  A or a ->���ȸ�� 
//  B or b -> �Ϲ�ȸ�� 
// �ƹ��͵� ���� ->�մ� 
 
 switch (grade) {
case 'A':
case 'a':
	System.out.println("��� ȸ��");
	break;
case 'B':
case 'b':
	System.out.println("�Ϲ� ȸ��");
	break;
default:
	System.out.println("�մ�");
	break;//���� ���� 
	
}
 
 // if ������ ���� 
 
 if (grade=='a'||grade=='A') {
	 System.out.println("��� ȸ��");
	
 }else if (grade=='b'||grade=='B') {
	 System.out.println("�Ϲ� ȸ��");
}else if (grade=='e'||grade=='E') {
	 System.out.println("�մ�");
}

 
 
 
 
 
	}

}
