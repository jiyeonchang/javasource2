package inheritance;

public class BonusPointAccount extends Account2{
private int bonusPoint;


public BonusPointAccount(String accountNo, int balance, String name,int bonusPoint) {
	super(accountNo, balance, name);
this. bonusPoint= bonusPoint;

}


@Override
	void deposit(int amount) {//�����ϴ� + ���ݾ��� ���ʽ� ����Ʈ 0.1%

		super.deposit(amount);
	
	bonusPoint += amount *0.001;
	}
public int getBounusPoint() {
	return bonusPoint;
}
}
