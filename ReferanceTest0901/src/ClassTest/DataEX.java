package ClassTest;

public class DataEX {
public static void main(String[] args) {
	Data data = new Data();
	
	//x�� �� 10���� ���� 
//	data.x=10; //data��ü �ȿ� x��� ������ ������ ��(10)������ ���ȿ������
//	change(data.x);
//	System.out.println("after change() x = "+data.x );
//	 System.out.println();
//	    
	    change(data);//change���ִ� ���� ȣ���� ȣ���ؾ��� ���������ϱ�
	    System.out.println("change() x = "+data.x );
}
static void change (int x) {
	x=10000;//�׳� x���� �ٲ���� ���ȿ� ���� �ٲ����¾��� 
	System.out.println("change() x = "+x );
    System.out.println();
 

}
static void change(Data d) {
	System.out.println(d);
//(Data d)���θ��� �����ص�Data data = new Data();�� ���� 
	// change�� ���� �ִ� �ּҰ� ����
	d.x=1000;
}
}
