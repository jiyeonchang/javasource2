package Test;

public class WhileTest01 {

	public static void main(String[] args) {

		
		int i=10; 
		while (i<10) {
	// {}�ݺ��ؾ��ϴ� �۾��ֱ�
			System.out.println("�ȳ��ϼ���");
			i++;// i++;�ȳ����� ���ѷ����� ���� 
		}
	System.out.println();
	
	i=1; 
	while(i<11) {
	System.out.print(i+"\t");
	i++;
	}
	System.out.println();
	
	//3�ǹ��
	i=3;
	while(i<101) {
	System.out.println(i+"");
	i+=3;
	}
}
}