package arrays;

import java.util.Arrays;

/*Arrays :�迭�� �ٷ�µ� ������ �޼��� ���� 
 * �迭 ����, �迭 ä��� ,�迭�� ���� , �˻� , ���ڿ� �� ,��� 
1 * �迭�� ����Ʈ�� ��ȯ 
 */
public class ArraysEx1 {
public static void main(String[] args) {
	int []arr = {0,1,2,3,4};
	int [][]arr2 = {
			{11,12,13},
			{21,22,23}
	};
	
//	System.out.println(arr);//�ּҰ��� ���� 
//	System.out.println(arr2);//��¥ �������� �ϱ����� Arrays���
	System.out.println(Arrays.toString (arr));
	System.out.println(Arrays.deepToString (arr2));//���߹迭��deepToString���� 
	
	
}
}
