package ClassTest;

public class TVclass3 {

	public static void main(String[] args) {

		//tv 3���� ��ü�� 3�� �����ϰ� �ʹ� 
		
		Tv3 tv1 = new Tv3();
		Tv3 tv2 = new Tv3();
		Tv3 tv3 = new Tv3();
		
		//�迭 ó���� �غ��� 
		Tv3 tvArr[]= new Tv3[3];
		
		tvArr[0]= new Tv3("����",true,5);
		tvArr[1]= new Tv3("����",false,6);
		tvArr[2]= new Tv3("���",true,2);
		printArr(tvArr);
		
		
	}
   static void printArr (Tv3 tvArr[]) {
	   //tvArr ��ü������ ����ϰ���� 
	   for (int i = 0; i < tvArr.length; i++) {
		System.out.println("TV����"+tvArr[i].getColor());
		System.out.println("TV����"+tvArr[i].isPower());
		System.out.println("TVä��"+tvArr[i].getChannel());
		System.out.println();
	}
	   
   }
	
	
	
}
