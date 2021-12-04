package com.suhj.iterator;

/**
 * ��ʾ��ܵ���
 * ʵ���˽ӿ�Arregate����Ҫ��������Ϊ���ϴ���
 * @author Haojie
 *
 */
public class BookShelf implements Arregate {
	
	private Book[] books;  //����з��˺ܶ���
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}

	/*
	 * ���ⲿ��Ҫ�������ʱ���ͻ�����������
	 * �÷��������� BookShelfIterator ��ʵ��������
	 */
	@Override
	public Iterator iterator() {		
		return new BookShelfIterator(this);
	}

}
