package reviewExam;

public  class abNoverridingEx6_4 {

	public static void main(String[] args) {
		abNoverriding6_2 dog=new abNoverriding6_2();
		abNoverriding6_3 cat = new abNoverriding6_3();
		
		dog.sound();
		cat.sound();
		System.out.println(" ------------------- ");
		
//		---------------------------------
		//������ �ڵ� Ÿ�� ��ȯ 
		abNoverriding6_1 animal  = null;
		animal = new abNoverriding6_2  ();
		animal.sound();
		animal = new abNoverriding6_3();
		animal.sound(); 
		System.out.println(">--------------<");
		
		//�޼ҵ��� ������ 
		abNoverriding6_1Sound(new abNoverriding6_2());
		
		
		
	}
	

}
