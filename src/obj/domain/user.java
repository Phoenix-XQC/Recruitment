package obj.domain;

/**
 * 
 * @author dreams
 *
 * 该类是用户类，描述应聘者信息，
 * 包括ID，用户名，密码，邮箱，个人介绍，性别
 * true:男
 * false:女
 * profile:个人简介，不会同步到简历
 * 注册只需“用户名，email，密码”
 * 
 */

public class user {

	private long id;
	private String username;
	private String password;
	private String email;
	private boolean sex;
	private String profile;
	
	
	
}
