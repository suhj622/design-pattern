/**
 * 
 */
package com.suhj.factory;

import java.util.List;
import java.util.ArrayList;


/**
 * @author Haojie
 *
 * ����Ĺ����� IDCardFactory���̳��˳��󹤳��� Factory
 */
public class IDCardFactory extends Factory {
	
	private List<String> owners = new ArrayList();

	/**
	 * ��д�˳������ createProduct ����
	 */
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	/**
	 * ��д�˳������ registerProduct ����
	 */
	@Override
	protected void registerProduct(Product Product) {
		owners.add(((IDCard)Product).getOwner());
	}
	
	/**
	 * ��ȡ�������ǵ�����������
	 * @return ����һ�� List ���͵�����
	 */
	public List getOwners() {
		return owners;
	}

}
