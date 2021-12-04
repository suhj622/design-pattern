package com.suhj.iterator;

/**
 * 遍历集合的接口
 * @author Haojie
 *
 */
public interface Iterator {
	
	/**
	 * 判断是否存在下一个元素的方法
	 * @return boolean
	 */
	public abstract boolean hasNext();
	
	/**
	 * 返回集合中的下一个元素
	 * 包含将迭代器移动至下一个元素的处理
	 * @return
	 */
	public abstract Object next();

}
