package user.action;

import com.opensymphony.xwork2.ActionSupport;

import dao.db.Cont;
import obj.cont.impl.CompanyCont;
import obj.domain.*;

public class company_registration extends ActionSupport {

	private company company;
	private String repass;
	public company getCompany() {
		return company;
	}
	public void setCompany(company company) {
		this.company = company;
	}
	public String getRepass() {
		return repass;
	}
	public void setRepass(String repass) {
		this.repass = repass;
	}
	
	@Override
	public String execute() {
		String message="input";
		
		System.out.println(company.getEmail());
		
		Cont addcompany = new CompanyCont();
		// ע�ṫ˾��Ҫ��˾���ƣ��û��������룬λ�ã����䣬 ���еļ�飬�绰���룬�����ڵ�¼����Ĳ���
		String sql = "insert into company(company_name, username, password, email, location) values(?,?,?,?,?)";
		String[] args = { 
				company.getCompany_name(),
				company.getUsername(),
				company.getPassword(),
				company.getEmail(),
				company.getLocation()
		};
		int status = addcompany.update(sql, args);
		if (status > 0) {
			message = "success";
		}

		return message;
	}
}
