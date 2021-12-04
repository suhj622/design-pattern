/**
 * 
 */
package com.suhj.factory;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Haojie
 *
 * 具体的工厂类 IDCardFactory，继承了抽象工厂类 Factory
 */
public class IDCardFactory extends Factory {
	
	private List<String> owners = new ArrayList();

	/**
	 * 重写了抽象类的 createProduct 方法
	 */
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	/**
	 * 重写了抽象类的 registerProduct 方法
	 */
	@Override
	protected void registerProduct(Product Product) {
		owners.add(((IDCard)Product).getOwner());
	}
	
	/**
	 * 获取所有者们的容器的引用
	 * @return 返回一个 List 类型的引用
	 */
	public List getOwners() {
		return owners;
	}

}
