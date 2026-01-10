package application;

<<<<<<< HEAD
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;
=======
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;
>>>>>>> e05a5c5b740340b536e6811b1e09131d1f338a0f

public class Program {

	public static void main(String[] args) {

<<<<<<< HEAD
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		
		
=======
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
	
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");

			st.setInt(1, 5);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
>>>>>>> e05a5c5b740340b536e6811b1e09131d1f338a0f
	}
}
