package dao.db;


import java.util.List;
/**
 * @author Admin
 *
 *���ƽӿڣ��ṩ��ɾ����ĸ��ӿڣ����ݲ�ͬ�ı�������ʵ�ָýӿڣ�
 *��Щ�����ӿ���ʱ����action��ʵ�֣�actionֻ������ã�����Ҫһ�������б���
 *��ѯ�������Ǹ��ݲ�ͬ�ı���ʵ��֮����һ����װ�Ĳ�ѯ�������صĽ����������װ���ַ�������
 *���µĺ��������û�û��ã��ڱ������˼���ɣ�
 *
 */
public interface Cont {
	public Object getOne(String sql,String[] str);
	public List getAllDB();
	public int update(String sql,String[] str);
//	public int delete(String sql,String[] str);
//	public int add(String sql,String[] str);
}
