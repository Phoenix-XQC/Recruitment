package obj.domain;

/**
 * 
 * @author dreams
 *
 * �������û��࣬����ӦƸ����Ϣ��
 * ����ID���û��������룬���䣬���˽��ܣ��Ա�
 * true:��
 * false:Ů
 * profile:���˼�飬����ͬ��������
 * ע��ֻ�衰�û�����email�����롱
 * 
 */

public class user {

	private long id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private boolean sex;
	private String profile;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
	
}
