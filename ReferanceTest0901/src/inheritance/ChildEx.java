package inheritance;

public class ChildEx {

public static void main(String[] args) {
	//child ��ü ���� ��� 2���� 
	//1)super (); => objest������ ȣ��
	// 2)super (age ); => Parent ������ ȣ�� 
	//3)this.age = age 
	//4) child ��ü ����
	child child = new child(25);//25�� �θ�Ŭ������ int age�� �Ѱܹޱ� ���� ���� �� 
	 System.out.println("child age : "+ child.getAge());
	child.play();
	child.print();
	
	 Parent parent =new child (26);
	 System.out.println("child age "+parent.getAge());
     parent.print();
}
}
