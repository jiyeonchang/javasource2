package Test;

import java.util.Iterator;

public class LoopTest01 {
//		for�������
//1-	int 1= 0;
//2-	i<10;	
//3- 	�ݺ��ؾ��� �۾����� ->	System.out.println("�ȳ��ϼ���");
//4- 	i++ (i=i+1) ->i=1
//5- 	i<10;
//6- 	�ݺ��ؾ��� �۾����� ->System.out.println("�ȳ��ϼ���");
//7- 	i++ (i=i+1) ->i=2
//8-	 1<10;
//9-	�ݺ��ؾ��� �۾����� ->System.out.println("�ȳ��ϼ���");
//10-	�ݺ� ....
//		i<10; ���� �Ҹ��� -> for ������ �������� ->for ���� 
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {// �ݺ��ؾ��� �۾�
			System.out.println("�ȳ��ϼ���");
					}
//  1-10���� ¦�������
//		int i =1;
//		i<11;
//		System.out.println(i);
//		i++
//		i<11;
//		System.out.println(i);
		for(int i=1; i<11; i++) {
			System.out.println(i);
		}
//		0-10,¦���� ��� 
		for (int i=0; i<11; i+=2) // i=i+2; -> i+=2
			System.out.print(i+"\t");  // tab�����Ÿ� print�θ� �Է�
	
//	3�ǹ���� 100���� 
	for(int i=3; i<100; i+=3) {
		//if(1%3==0)   / Systemout.print (i+"");�̷���if���� ������������
	System.out.println(i);
	
	
	}
	//1���� 100���� �����߿��� 3�� ������� ���ϴ� ���α׷� �ۼ� 
//	�� 9�� ����� ������ �ʽ��ϴ� 
	int sum =0;
	for (int i = 0; i < 101; i++) {
		if(i%3==0&& i%9!=0);
		{sum= sum=i; //sum+=i������
	}
	}System.out.println("3�� ����̰� 9�� ����� �ƴ� �� :"+sum);
	
	System.out.println();
	
//	1���� 100���� �����߿��� 3�� ����ų� 5�� ����� ���� �� 
	
 int sum1 = 0;
 for (int i = 0; i < 101; i++) {
	if (i%3==0||i%5==0)
	{
      sum1+=i;
    		 }
 }
	
 System.out.println("3�� ����ų� 5�� ����� ���� ��"+sum1);
	}

}