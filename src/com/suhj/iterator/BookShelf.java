package com.suhj.iterator;

/**
 * 表示书架的类
 * 实现了接口Arregate，需要将该类作为集合处理
 * @author Haojie
 *
 */
public class BookShelf implements Arregate {
	
	private Book[] books;  //书架中放了很多书
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
	 * 当外部想要遍历书架时，就会调用这个方法
	 * 该方法会生成 BookShelfIterator 的实例并返回
	 */
	@Override
	public Iterator iterator() {		
		return new BookShelfIterator(this);
	}

}
