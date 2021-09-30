package shopexample;

import java.util.Scanner;

public class MyShop implements Ishop {

	private String title;
	private Scanner sc = new Scanner(System.in);
	private String seluser;

	private Product[] carts = new Product[10];

	private User user[] = new User[2];

	private Product[] product = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		user[0] = new User("ȫ�浿", PayType.CARD);
		user[1] = new User("�̷���", PayType.CASH);

	}

	@Override
	public void genproduct() {
		product[0] = new SmartTv("�Ｚ", 1000, " 10");
		product[1] = new SmartTv("�ص�", 2000, " 20");
		product[2] = new SmartTv("����", 3000, " 30");
		product[3] = new CellPhone("����", 1000, "kt");
		product[4] = new CellPhone("����", 2000, "ky");
	}

	@Override
	public void Start() {
		System.out.println("====================");
		System.out.println(title + " Myshop : ����ȭ�� - ���� ���� ");
		System.out.println("====================");

		for (int i = 0; i < user.length; i++) {
			System.out.printf("[%d] %s (%s)\n", i, user[i].getname(), user[i].getPaytype());
		}
		System.out.println("[x]���� ");
		System.out.println("���� :");
		
		String input = sc.next();
		System.out.println("###" + input + "###");
		
		
		switch (input) {
		case "x":
			System.exit(0);
			break;

		default:
			seluser = input;
			productList();
			break;
		}

	}

	private void productList() {
		System.out.println(title + "��ǰ ��� - ��ǰ����");
		System.out.println("=========================");

		for (int i = 0; i < product.length; i++) {
			System.out.printf("[%d]", i);
			product[i].printDetail();
		}
		System.out.println("[h]����ȭ��");
		System.out.println("[c]üũ�ƿ�");
		System.out.println("����: ");

		String input = sc.next();

			switch (input) {
			case "h": Start();
			

				break;
			case "c": checkOut();

				break;

			default:
				for (int i = 0; i < carts.length; i++) {
					if(carts[i]==null) {
						carts[i] =product[Integer.parseInt(input)];
					}
				}
				productList();
				break;
			}
		}
	

	private void checkOut() {
		System.out.println("##c����##");
		System.out.println(title+": üũ�ƿ�");
		System.out.println("=================");
		int total = 0;
for (int i = 0; i < carts.length; i++) {
	if(carts[i]!=null) {
		System.out.printf("[d] %s (%d)\n",i , carts[i].getPname(),carts[i].getPrice());
	total+=carts[i].getPrice()	;
	
	
	}
	
	System.out.println("========================");
	System.out.println("�������"+user[Integer.parseInt(seluser)].getPaytype());
	System.out.println("�հ� :"+total);
	System.out.println("[p]����[q]���� �Ϸ�");
	System.out.println("����:");
	
	String input = sc.next()	;
	switch (input) {
	case "p":
		productList();
		break;

	default:System.out.println("�ý������� �մϴ�");
		break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}		
	}
}
