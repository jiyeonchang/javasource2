package collection;

import java.util.Stack;

//Stack : LIFO (last in first Out)
// ���İ��,���� ��ȣ �˻� ,undo,redo,���Ƕ���� �ڷ�/������ �Ҷ� stack�� ���� 

public class StackEx {

	public static void main(String[] args) {
Stack<String> stack = new Stack<String>();
//������ ����
stack.push("���");
stack.push("����");
stack.push("�ٳ���");
stack.push("��");
	
	//������ �������� 

System.out.println(stack);

System.out.println();

while(!stack.empty()	) {//stack�� ���ڸ��� �ƴѰ��� pop(stack�� ���ٴܾ�)���Ͷ�
	System.out.println(stack.pop());
	
}
	}
	

}
