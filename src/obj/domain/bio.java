package obj.domain;

/**
 * 
 * @author admin
 * 
 * ���������û��������࣬
 * ����id���������ͣ�ʵϰ��ȫְ����ٹ��������������ص㣬��н����������
 * 
 */

public class bio {

	private int id;
	private String job;
	private String location;
	private int low; //н����ͺ����
	private int high;
	private String profile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
}