package inheritance;

public class DmbCellphone extends CellPhone {
	int channel; 
	 
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� dmb��� ���� ");
		
	}void turnOffDmb(){
		System.out.println("ä��"+channel+"�� dmb��� ���� ");
	}
	void shangChannelDmb(int channel) {
		System.out.println("ä��"+channel+"�� ����");
	}

}
