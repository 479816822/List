package cn.edu.qdu.list;
/*
 * ����һ�����Ա�Ľӿ�
 */
public interface List {

	//����һ��ָ��λ�õ�����
	public void insert(int i,Data data)throws ArrayIndexOutOfBoundsException;
	//ɾ��һ��ָ��λ�õ�����
	public void delete(int i)throws ArrayIndexOutOfBoundsException;
	//��ѯһ��ָ��λ�õ�����
	public Data query(int i)throws ArrayIndexOutOfBoundsException;
	//����ָ��λ�õ�����
	public void upData(int i,Data data)throws ArrayIndexOutOfBoundsException;
	//��ѯ���Ա�����ݳ��ȵĴ�С
	public int size();
	//�ж����Ա��Ƿ�Ϊ��
	public boolean isEmpty();
	
	
}
