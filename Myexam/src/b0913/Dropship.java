package b0913;

public class Dropship extends Unit {
 void load() {}
 void upload() {}
 
	@Override
	void move(int x, int y) {
		   System.out.printf("%d,%d�������� �̵�",x,y);
	}

}
