package OnlineShoppingAPP;

abstract class User {
	
	protected int userId;
	protected String username;
	protected String email;
	
	public User(int userId, String username, String email) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

}
