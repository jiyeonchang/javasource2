package reviewExam;

//�����ε� ���� ���� 
/*���� �ε� �̶�?
 * -�ϳ��� �޼ҵ� �̸��� ���� ����� ��´�.
 * -�����ε��� ������ �Ű������� Ÿ��, ����, ������ �ϳ��� �޶���Ѵ� 
 */
public class Overloading1_1 {
	// ���簢���� ����

	double areaRectangle(double width) {
		return width * width;
	}

	// ���簢���� ����

	double areaRectangle(double width, double height) {
		return width * height;
	}

}
