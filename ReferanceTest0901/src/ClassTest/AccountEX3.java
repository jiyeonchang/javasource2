package ClassTest;




public class AccountEX3 {

	public static void main(String[] args) {
		Account3 accArr[]= new Account3[5];
		
		
		accArr[0] = new Account3("231",1000,"ȫ�浿");
		accArr[1] = new Account3("312",15564,"�ѹ赿");
		accArr[2] = new Account3("45",561,"�����");
		accArr[3] = new Account3("3634",564,"��ι�");
		accArr[4] = new Account3("6364",516,"�λ�");
		
//		
//		for (int i = 0; i< accArr.length; i++) {
//		
//			System.out.print(accArr[i].getName()+"\t");
//			System.out.print(accArr[i].getAccountNo()+"\t");
//			System.out.println(accArr[i].getBalance()+"\t");
//		}
		accountPrint(accArr);
			
		
System.out.println();

		for (int i = 0; i< accArr.length; i++) {
			Account3 account = accArr[i];
//			
//			//�Ա� (	Account3 account = accArr[i];)�̰� �� �Ǵ��� /heap�� �ּҰ� �������� 
			account.deposit(10000);
			accountPrint(account);
//			System.out.print(account.getName()+"\t");
//			System.out.print(account.getAccountNo()+"\t");
//			System.out.println(account.getBalance()+"\t");
	}
		
		
		
	}
	//�޼ҵ� �����ε��̴� ()���� �ٸ��� ����Ѵ� 
	
	static void accountPrint(Account3 accArr[]){
		for (int i = 0; i< accArr.length; i++) {
			
			System.out.print(accArr[i].getName()+"\t");
			System.out.print(accArr[i].getAccountNo()+"\t");
			System.out.println(accArr[i].getBalance()+"\t");
		}
	}
	
	static void accountPrint(Account3 account){
		System.out.print(account.getName()+"\t");
		System.out.print(account.getAccountNo()+"\t");
		System.out.println(account.getBalance()+"\t");
		}
	}
	
	
	
	

