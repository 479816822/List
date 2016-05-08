package cn.edu.qdu.list;

public class SqList implements List {
	private int listSize;		//线性表的长度
	private int maxListSize;	//线性表的最大长度
	private Data[] base;		//申明一个数组用来存储线性表
	
	//初始化线性表
	
	
	public SqList(int maxListSize) {
		super();
		this.init(maxListSize);
	}
	
	public void init(int maxListSize){
		this.maxListSize = maxListSize;
		this.listSize=0;
		base=new Data[maxListSize];
	}

	//插入一个指定位置的数据
	@Override
	public void insert(int i, Data data) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(i>maxListSize||i<1){
			throw new AbstractMethodError("插入的位置不对");
		}else if(listSize==maxListSize){
			throw new ArrayIndexOutOfBoundsException("线性表已满");
		}else if(i>listSize+1){
			throw new AbstractMethodError("插入的位置不对");
		}
		for (int j = listSize; j >= i; j--) {
			base[j]=base[j-1];
			
		}
		base[i-1]=data;
		listSize++;
		

	}

	@Override
	public void delete(int i) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}

	@Override
	public Data query(int i) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void upData(int i, Data data) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
