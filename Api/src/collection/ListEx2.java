package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {

	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();

list.add("java");
list.add("adf");
list.add("gffgg");
list.add("ssss");
list.add("jjjj");
list.add("java");

System.out.println(list);
 
list.add(2, "oracle");//2���ڸ��� ����Ŭ �ְ���� �� 

System.out.println(list);

//�����ϱ�
list.remove(1);//adf���� 
System.out.println(list);

//���� 

list.sort(Comparator.reverseOrder());
System.out.println(list);//�������� reverseOrder()/�������� nateuralOrder()





	}

}
