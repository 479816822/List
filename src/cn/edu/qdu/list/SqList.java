package cn.edu.qdu.list;

public class SqList implements List {
	private int listSize;		//���Ա�ĳ���
	private int maxListSize;	//���Ա����󳤶�
	private Data[] base;		//����һ�����������洢���Ա�
	
	//��ʼ�����Ա�
	
	
	public SqList(int maxListSize) {
		super();
		this.init(maxListSize);
	}
	
	public void init(int maxListSize){
		this.maxListSize = maxListSize;
		this.listSize=0;
		base=new Data[maxListSize];
	}

	//����һ��ָ��λ�õ�����
	@Override
	public void insert(int i, Data data) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(i>maxListSize||i<1){
			throw new AbstractMethodError("�����λ�ò���");
		}else if(listSize==maxListSize){
			throw new ArrayIndexOutOfBoundsException("���Ա�����");
		}else if(i>listSize+1){
			throw new AbstractMethodError("�����λ�ò���");
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
