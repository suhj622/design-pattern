package com.suhj.iterator;

/**
 * ������ܵĵ�������ʵ���˽ӿ� Iterator
 * @author Haojie
 *
 */
public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf; //����һ����ܶ��������
	private int index; //��¼����λ�ã���ʾ��������ǰ��ָ����������
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/**
	 * �жϼ������Ƿ������һ��Ԫ��
	 * ���򷵻� true�����򷵻� false
	 */
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()) {
			return true;
		}else {
			return false;			
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);//��ȡ��ǰλ�õ��鱾
		index++;//����ָ����һ����
		return book;
	}

}
