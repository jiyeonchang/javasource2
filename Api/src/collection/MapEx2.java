package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//map���� ��ü������ �� �������� 1
public class MapEx2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// ��� �߰�
		map.put("id_111", "ȫ�浿 ");
		map.put("id_222", "��浿 ");
		map.put("id_333", "�ֱ浿 ");
		map.put("id_444", "���浿 ");

		//�������� 
		Set<String >keys = map.keySet();//�߰����� ���� 
		//List ,set ,map�� ����� �����͵��� ǥ��ȭ�� ������� ������ �� �ֵ��� ���� 
		Iterator<String> iter = keys.iterator()	;
		while (iter.hasNext()) {//hasNext������ �����Ͱ��ֳ�?����ǹ�next()�� �������� 
//			System.out.println(iter.next());
			String userId = iter.next()	;
			String value = map.get(userId);
			System.out.println(userId +" : "+value);
			
		}
	System.out.println();
	//�ι�° ��� 
	
	//Map.Entry ��ü ��� 
	Set<Entry<String, String>> entrySet = map.entrySet();
	Iterator<Entry<String, String>> iter2= entrySet.iterator();
	
	while(iter.hasNext()) {
		Entry<String, String> entry = iter2.next();
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	}

}
