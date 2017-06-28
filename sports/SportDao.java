package tw.com.softleader.sample.sports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import tw.com.softleader.sample.commons.GenericDao;

public class SportDao implements GenericDao<Sport> {

	private final String DB_DRIVER = "org.postgresql.Driver";

	private final String DB_URL = "jdbc:postgresql://localhost:5432/testdb";

	@Override
	public Sport findOne(Long id) {
		return null;
	}

	@Override
	public Collection<Sport> findAll() {
		
		Collection<Sport> sports = new ArrayList<Sport>();

		Class.forName(DB_DRIVER);
		Connection connection = DriverManager.getConnection(DB_URL, "postgres", "postgres");

		Statement stmt = connection.createStatement();

		String sqlCmd = "SELECT * FROM sport";

		ResultSet rs = stmt.executeQuery(sqlCmd);

		while (rs.next()) {
			Sport sport = new Sport();
			sport.setId(rs.getLong("id"));
			sport.setName(rs.getString("name"));
			sport.setPeople(rs.getString("people"));
			
			sports.add(sport);
		}
		rs.close();
		stmt.close();
		connection.close();

		return sports;
	}

	@Override
	public void insert(Sport entity) {

	}

	@Override
	public void update(Sport entity) {

	}

	@Override
	public void delete(Long id) {

	}

}
