package shopexample;

public abstract class Product {
String Pname ;
int price;

public Product(String pname, int price) {
	super();
	Pname = pname;
	this.price = price;
}

public String getPname() {
	return Pname;
}

public void setPname(String pname) {
	Pname = pname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public void printDetail () {
	System.out.println("��ǰ�� :"+this.Pname);
	System.out.println("��ǰ ���� :"+this.price);
	printExtra();
}
public abstract void printExtra() ;

}
