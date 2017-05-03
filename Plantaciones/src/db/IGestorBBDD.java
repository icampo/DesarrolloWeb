package db;

import java.sql.ResultSet;

public interface IGestorBBDD {
	public ResultSet executeSQL(String sql);
	public void updateSQL(String sql);
}
