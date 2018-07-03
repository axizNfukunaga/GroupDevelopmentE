package jp.co.example.entity;

public class Users {
	private String user_id;
	private String user_nic;
	private String password;
	private boolean unsub_flag;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_nic() {
		return user_nic;
	}
	public void setUser_nic(String user_nic) {
		this.user_nic = user_nic;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isUnsub_flag() {
		return unsub_flag;
	}
	public void setUnsub_flag(boolean unsub_flag) {
		this.unsub_flag = unsub_flag;
	}

}
