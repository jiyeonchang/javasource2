package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {
		// ����̹� �ε�
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;

			try {
				Class.forName("oracle.jdbc.OracleDriver");

				String url = "jdbc:oracle:thin:@125.132.75.187:1521:xe";
				String user = "c##scott";
				String password = "tiger";

				con = DriverManager.getConnection(url, user, password);

				if (con != null) {
					System.out.println("����Ǿ����ϴ�");

					// sql ���� �ۼ� => emp���̺��� ��� �����͸� ��ȸ �ϰ����
					String sql = "Select * From emp";

					// sql ������ ������ ���̽� ������ ����
					pstmt = con.prepareStatement(sql);

					// sql������ ����� ����� �޾ƿ���
					rs = pstmt.executeQuery(); // ���� /rs�� �ޱ�

					// �޾ƿ� ����� ȭ�鿡 ���
					System.out.println("empno   ename   job     mgr    hiredate     sal      comm     deptno");
					
					while(rs.next()) {// ReaultSet ��ü�ȿ� �о�� ������ ������ true 
						System.out.print(rs.getInt("empno")+"\t");//number�ϱ� getInt
						System.out.print(rs.getString("ename")+"\t");//varchar2 
						System.out.print(rs.getString("job")+"\t");
						System.out.print(rs.getInt("mgr")+"\t");//number
						System.out.print(rs.getDate("hiredate")+"\t");//Date
						System.out.print(rs.getInt("sal")+"\t");//number
						System.out.print(rs.getInt("comm")+"\t");//number
						System.out.println(rs.getInt("deptno")+"\t");//number
					}
				}

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
