/**
 * 
 */
package com.suhj.factoryMethod;

/**
 * @author Haojie
 *
 * ����Ĳ�Ʒ�� IDCard���̳��˳����� Product
 */
public class IDCard extends Product {
	
	private String owner; //��Ʒ������
	
	IDCard(String owner) {
		System.out.println("����" + owner + "�� ID ����");
		this.owner = owner;
	}
    
	/**
	 * ��д�˳����Ʒ�� Product �ķ��� 
	 */
	@Override
	public void use() {
		System.out.println("ʹ��" + owner + "�� ID ����");
	}

	public String getOwner() {
		return owner;
	}
	

}
