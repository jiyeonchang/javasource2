
public class ColorTV extends TV {
	
	
    private int color;
		
		

	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
		
		
	}

	
	public int getColor() {
		return color;
	}
	

	
	
	public void printproperty ( ) {
		System.out.printf("%d ��ġ %d �÷�", getSize(),color);
	}

	
//private void printProperty(ColorTV my) {
//	System.out.println("%d ��ġ %d �÷�"myTV.getSize());
//	}
}

