package arrays;

import java.util.Arrays;
import java.util.Comparator;
//���� �迭 �����ϴ¹� Arrays ���
//�迭 ���� ���� sort //���Ⲩ ���� �ٿ�޾ƾ��� 
public class ArraysEx2 {
public static void main(String[] args) {

int arr1[]=  {10,73,2,5,42};
int arr2[]=  {10,73,2,5,41};

System.out.println(Arrays.equals(arr1, arr2)? "���� ": "�ٸ� ");

System.out.println();

int arr3 []= {13,5,15,32,54,87,12,};
 Arrays.sort(arr3);//���� ���� Comparator.naturalOrder()
System.out.println(Arrays.toString(arr3));

// Arrays.sort(null, null); //�������� sort(T[]a,Comparator<?super?>c)�����ؾߵ�
Integer arr4[]= {45,78,1,23,54,68,55};
Arrays.sort(arr4, Comparator.reverseOrder());//reverseOrder�������� 
System.out.println(Arrays.toString(arr4));

String strArr[]= {"apple","good","very","height","zero","zoo"};

Arrays.sort(strArr);
System.out.println(Arrays.toString(strArr));//���� ���� 

Arrays.sort(strArr,Comparator.reverseOrder());
System.out.println(Arrays.toString(strArr));//����  ���� 

Character chArr[]= {'��','��','��','��','��','��','��'};
Arrays.sort(chArr);
System.out.println(Arrays.toString(chArr));






}
}

