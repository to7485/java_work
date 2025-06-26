package ex02_db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {

	public static List<Person> find() {
		List<Person> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from person";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			//next()
			//읽어올 행이 있으면 true
			//없으면 false
			while (rs.next()) {
				Person p = new Person();
				p.setIdx(rs.getInt("idx"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));

				list.add(p);
			}
			//SQLException
			//데이터에 접근하는 동안 발생하는 모든 예외
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	// person테이블에 데이터를 추가하는 add메서드
	public static void add(int idx, String name, int age) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into person values(?,?,?)";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			rs = pstmt.executeQuery();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (pstmt != null) {
					pstmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}