package arrays;

import java.util.Arrays;
import java.util.Comparator;
//ã�� ���� �ڸ� ��ȸ Arrays
public class ArraysEx3 {
public static void main(String[] args) {

int arr3 []= {15,21,15,32,54,87,12,};
//54���ڰ� ���°�� �ִ��� ��ȸ for������  

for (int i = 0; i < arr3.length; i++) {
	if(arr3[i]==54) {
		System.out.println(i+1+"��° ã����");
		break;
	} 
}
System.out.println();
//Arrays�� ã�� 
Arrays.sort(arr3);
System.out.println(Arrays.toString(arr3));
int pos = Arrays.binarySearch(arr3, 54);//binarySearch:�����˻�(������ �Ǿ��ִ°� �����λ�밡��) 
System.out.println(pos+1+"��° ã����");






}
}

