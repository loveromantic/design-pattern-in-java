package cn.com.hohistar.tutorial.design.pattern.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class JDBCTemplate {

	public void select(Connection conn, String sql, Map<Integer, Object> params, IRowHandler rowHandler, boolean closeConnection) {
		
		PreparedStatement pStmt = null;
		ResultSet rSet = null;
		
		try {
			
			pStmt = conn.prepareStatement(sql);
			if (params != null && !params.isEmpty()) {
				Integer[] keys = (Integer[]) params.keySet().toArray();
				for(int i = 0; i < keys.length; i++) {
					Integer key = keys[i];
					Object value = params.get(key);
					pStmt.setObject(key, value);
				}
			}
			rSet = pStmt.executeQuery();
			while(rSet.next()) {
				rowHandler.handleRow(rSet, rSet.getRow());
			}
		} catch(SQLException e) {
			
			
		} finally {
			
			if (rSet != null) {
				
				try {
					rSet.close();
				} catch(SQLException e) {}
			}
			
			if (pStmt != null) {
				
				try {
					pStmt.close();
				} catch(SQLException e) {}
			}
			
			if (closeConnection && conn != null) {
				
				try {
					conn.close();
				} catch(SQLException e) {}
			}
			
		}
		
	}
}
