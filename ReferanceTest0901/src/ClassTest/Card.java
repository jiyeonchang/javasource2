package ClassTest;

public class Card {
	//�������
   private String kind; //ī��������
   private int number ; //ī�� ���� ���� 
    
//    int width=10;
//    int height=7;
    
   //Ŭ���� ����
    static int width =10;
    static int height = 7 ;
    //static (����):Ŭ������ ������ ���,��ü���� ���������ʰ� ���     
// heap�� �����ϸ� ���� �ٸ����ִµ� �ƿ� ������ static�� ����� ���� ������ ������ 
//		Ŭ������ �޸𸮿� �ε�ɶ� ���� 
    public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
		//static �޼ҵ� : ��ü�� �������� �ʰ� ��� 
//		Ŭ������ �޸𸮿� �ε�ɶ� ���� 
	//static �޼��� �ȿ��� (�Ϲ� �������)�ν��Ͻ� ��� ��� �Ұ� 
		//���� static�� ���� 
		//Static ���Ǵ°� : ������� ,�޼��� ,�ʱ�ȭ��
	}

	public String getKind() {
		return kind;
	}

	public int getNumber() {
		return number;
	}

//	public static int getWidth() {
//		return width;
//	}
//
//	public static int getHeight() {
//		return height;
//	}
    
    
}
