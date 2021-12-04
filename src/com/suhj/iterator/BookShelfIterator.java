package com.suhj.iterator;

/**
 * 遍历书架的迭代器，实现了接口 Iterator
 * @author Haojie
 *
 */
public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf; //持有一个书架对象的引用
	private int index; //记录迭代位置，表示迭代器当前所指向的书的索引
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	/**
	 * 判断集合中是否存在下一个元素
	 * 是则返回 true；否则返回 false
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
		Book book = bookShelf.getBookAt(index);//获取当前位置的书本
		index++;//索引指向下一本书
		return book;
	}

}
