package inheritance;

public class CaptionTVEx {

	public static void main(String[] args) {
 CaptionTV ctv = new CaptionTV();
 ctv.channel = 10;
 ctv.channelUp();
	
	System.out.println("���� ä�� "+ ctv.channel);
	
	ctv.displaycaption("hello Werld");//�ȳ����� ������ true�� �����༭ false���� �ȳ��� 
	ctv.caption =true;
	ctv.displaycaption("hello java");
	
	}

}
