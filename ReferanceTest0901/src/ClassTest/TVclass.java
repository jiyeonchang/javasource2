package ClassTest;

public class TVclass {

	public static void main(String[] args) {

		
		Tv tv =new Tv();
		System.out.println(tv);
		
		//��ü ���� 
		tv.power= true ; //on
		tv.channel= 2; 
		
		tv.channelUp();//3������ �ö�//�޼ҵ� ȣ�� 
		System.out.println("ä�λ��� : "+ tv.channel );
		
	}

}
