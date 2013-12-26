import java.sql.*;


public class userdaotest {

	/**
	 * @param args 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("whiteShip");
		user.setName("백기선");
		user.setPasswd("married");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		System.out.println(user2.getPasswd());
		
		System.out.println(user2.getId() + " 조회성공");
	}

}
