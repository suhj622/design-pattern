/**
 * 
 */
package com.suhj.factoryMethod;

/**
 * @author Haojie
 *
 * 抽象工厂类 Factory
 */
public abstract class Factory {
	
	/**
	 * 定义了工厂生成产品的方式（或流程）
	 * @param owner 产品所有者
	 * @return 返回生成的产品对象的引用
	 */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
    /**
     * 定义了生成产品的方法，由子类实现
     * @param owner 产品所有者
     * @return 返回产品对象的引用
     */
	protected abstract Product createProduct(String owner);
	
	/**
	 * 定义了注册产品的方法，由子类实现
	 * @param Product 产品对象的引用
	 */
	protected abstract void registerProduct(Product Product);

}
