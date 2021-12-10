/**
 * 
 */
package com.suhj.factoryMethod;

/**
 * @author Haojie
 *
 * 具体的产品类 IDCard，继承了抽象类 Product
 */
public class IDCard extends Product {
	
	private String owner; //产品所有者
	
	IDCard(String owner) {
		System.out.println("制作" + owner + "的 ID 卡。");
		this.owner = owner;
	}
    
	/**
	 * 重写了抽象产品类 Product 的方法 
	 */
	@Override
	public void use() {
		System.out.println("使用" + owner + "的 ID 卡。");
	}

	public String getOwner() {
		return owner;
	}
	

}
