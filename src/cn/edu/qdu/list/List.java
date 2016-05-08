package cn.edu.qdu.list;
/*
 * 这是一个线性表的接口
 */
public interface List {

	//插入一个指定位置的数据
	public void insert(int i,Data data)throws ArrayIndexOutOfBoundsException;
	//删除一个指定位置的数据
	public void delete(int i)throws ArrayIndexOutOfBoundsException;
	//查询一个指定位置的数据
	public Data query(int i)throws ArrayIndexOutOfBoundsException;
	//更新指定位置的数据
	public void upData(int i,Data data)throws ArrayIndexOutOfBoundsException;
	//查询线性表的数据长度的大小
	public int size();
	//判断线性表是否为空
	public boolean isEmpty();
	
	
}
