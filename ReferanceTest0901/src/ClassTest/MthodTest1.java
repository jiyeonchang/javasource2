package ClassTest;

public class MthodTest1 {

	/*
	 *���ϴ��� �޼ҵ��(....){
	 *
	 *����Ÿ���� void�ΰ��� ���� �Ѵٸ� 
	 *������ returnŰ���尡 ���;��� } 
	 * 
	 */
	
	
	//���ϰ��� true/false�޼ҵ� ����=>boolean
	boolean isRedirect() {
		return false;//return ������ �;��� 
	}
	
	//���ϰ��� intŸ���� �޼ҵ�
	
	int sum () {
		return 3; 
	}
	
	//���ϰ��� int ,�ΰ��� �������� (int)�� �ޱ� 
	
	int multiply(int num1, int num2) {
		return num1* num2 ; 
	}
	
	//���ϰ��� long ,�ΰ��� �������� (int)�� �ޱ� 
	long add (long num1 , long num2) {
		return num1+ num2;
		
	}
	//���ϰ�: char �޼ҵ� 
	char method () {
		return 'c';
	}


void method1() {//�ѱ�� �� ���� 
	
	
}


//����Ÿ�� : int �� 1���� �迭 
//�������� : int �� 1���� �迭 
int []print (int arr[] ){
	return arr; 
}
// ���� Ÿ�� : double ,�Ű����� : �ΰ��� double 
// �ؾ����� : ���� �ΰ��� �Ű������� �������� ��� ���� 
double divide (double a, double b 	) {
	return a/b ; 
}







}
