/**
 * 
 */
package com.suhj.factoryMethod;

/**
 * @author Haojie
 *
 * ���󹤳��� Factory
 */
public abstract class Factory {
	
	/**
	 * �����˹������ɲ�Ʒ�ķ�ʽ�������̣�
	 * @param owner ��Ʒ������
	 * @return �������ɵĲ�Ʒ���������
	 */
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
    /**
     * ���������ɲ�Ʒ�ķ�����������ʵ��
     * @param owner ��Ʒ������
     * @return ���ز�Ʒ���������
     */
	protected abstract Product createProduct(String owner);
	
	/**
	 * ������ע���Ʒ�ķ�����������ʵ��
	 * @param Product ��Ʒ���������
	 */
	protected abstract void registerProduct(Product Product);

}
