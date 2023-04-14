package week14;

import java.sql.*;


public class CreateSimpleBankDB {

	//Print contents of database
	public static void printDB() {
		try {
			SimpleDataSource.init("database.properties");
			Connection conn = SimpleDataSource.getConnection();
			try {


				Statement stat = conn.createStatement();

				ResultSet result = stat.executeQuery("SELECT * FROM Accounts");
				while (result.next()) {
					System.out.println(result.getString("Owner") + ", " +
							result.getInt("Account_num") + ", " +
							result.getDouble("Balance"));
				}

			} catch (Exception e) {
				System.out.println("Exception " + e);
			}
			conn.close();
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}

	}


	public static void main(String[] args) throws Exception {

		try {
			SimpleDataSource.init("database.properties");
			Connection conn = SimpleDataSource.getConnection();

			try {

				Statement stat = conn.createStatement();
				DatabaseMetaData dbmd = conn.getMetaData();
				ResultSet rs = dbmd.getTables(null, null, "ACCOUNTS", null);

				if (rs.next()) {
					stat.execute("DROP TABLE Accounts");
					System.out.println("Drop Accounts");
				}



				String query = "CREATE TABLE Accounts (Account_Num INTEGER Not NULL," +
						"Owner VARCHAR(40) NOT NULL," +
						"Balance FLOAT NOT NULL," +
						"CONSTRAINT PK_BankAccount PRIMARY KEY(Account_Num))";

				stat.execute(query);
				System.out.println("Created Accounts");
				query = "INSERT INTO Accounts(Account_num, Owner, Balance) VALUES(10,'Joe Doe',100.20)," +
						"(20,'Suzy Que',3943.30)," +
						"(30,'Tom Thumb',54.34)," +
						"(40,'Chis Cringle', 399.30)";

				stat.execute(query);
				System.out.println("Inserted into Accounts");

				//print contents of database
				printDB();

			} catch (Exception e) {
				System.out.println("Database error " + e);

			}
			conn.close();
		} catch (Exception e) {
			System.out.println("error");

		}
	}
}
