package company.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.db.Cont;
import obj.cont.impl.TypeCont;
import obj.domain.category;


public class JobType extends ActionSupport{
	
//	����������ļ��ϣ�������get set����
	private List<category> firstlist;
	private List<category> secondlist;

	
	public List<category> getFirstlist() {
		return firstlist;
	}


	public void setFirstlist(List<category> firstlist) {
		this.firstlist = firstlist;
	}


	public List<category> getSecondlist() {
		return secondlist;
	}


	public void setSecondlist(List<category> secondlist) {
		this.secondlist = secondlist;
	}

	
	public String searchCategory() {
		Cont search = new TypeCont();
		this.secondlist = search.getAllDB();
		TypeCont type = new TypeCont();
		this.firstlist = type.getFirstType();
//		System.out.println(this.typelist.get(0).getSecond());
		return "success";
	}

}
