
public class IpTv extends ColorTV {

	private String ip;
	public IpTv(int size, int color,String ip) {
		super(size, color);
		
		
			this.ip = ip; 
		// TODO Auto-generated constructor stub
	}
	public void printproperty() {
		System.out.printf("���� ipTv �� %s ,�ּҴ� %d ��ġ %d",ip,getSize(),getColor());
	}
	
}
