package inheritance;

public class SubListString extends ListString {
 String name ="�����";
   @Override
	public void List() {
	   super.List();//�θ��� ����Ʈ ȣ��
System.out.println(name + " ���� Ŭ���� ");	}


public void writer () {
	System.out.println(super.name);
}


}