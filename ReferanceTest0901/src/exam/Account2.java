package exam;

public class Account2 {
	
	
//	 ano ; //���¹�ȣ 
//	 owner;//������ 
//	 balance ;//�ܾ�
	
	//��� ���� ���� 
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account2 (String ano,String ower ,int balance)
	{super ();
	this.ano = ano;
	this.owner = owner;
	this.balance = balance;
		
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano=ano;
	}
	
	public String getowner() {
		return owner ;
		
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	 public int getbalance () {
		 return balance;
	 }
	 
	 public void setBalance (int balance	) {
		 this.balance= balance;
	 }
	
	
	//Ŭ���� ���� 
	//private ���� ���������ϱ� �ٸ� Ŭ������ ȣ���Ҽ��ְ��� 
	
	
	

}
