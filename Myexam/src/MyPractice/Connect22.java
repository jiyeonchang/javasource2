package MyPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect22 {
public static void main(String[] args) {
	
	Connection  con = null;
	try {
		//����̹� �ε� 
		Class.forName("oracle.jdbc.OracleDriver");
		
		//���� �õ� java.sql �� get���ʹ� ����¥�� ����
		//@125.132.75.187  ���� ��ǻ�� ����
		String url ="jdbc:oracle:thin:@125.132.75.187:1521:xe";
		String user ="c##scott";
		String password ="tiger";
		con = DriverManager.getConnection(url, user, password);
		
		if(con!=null) {
			System.out.println("����Ǿ����ϴ�");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}//��������� api�� �����Ҽ� �ִ� ����̺긦 �����ִ°���(����� ����Ŭ dvs������) 
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
