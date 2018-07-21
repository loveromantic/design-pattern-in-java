package cn.com.hohistar.tutorial.design.pattern.template;

import java.sql.ResultSet;

public interface IRowHandler {

	public void handleRow(ResultSet rSet, int row);
	
}
