/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * ��̬�ڲ��෽ʽ - ����˵�������ķ�ʽ
 * JVM ��֤����
 * �����ⲿ��ʱ��������ڲ��࣬��������ʵ��������
 */
public class Mgr07 {
	

	private Mgr07() {};
	
	/**
	 * 
	 * @author Haojie
	 * 
	 * ��̬�ڲ��࣬�ڷ��ʵ�ʱ�Żᱻ���ؽ� JVM
	 * 
	 */
	private static class Mgr07Holder {
		private final static Mgr07 INSTANCE = new Mgr07();
	}
	
	/**
	 * �����ʸ÷���ʱ����̬�ڲ�����ؽ� JVM������ʼ�� Mgr07 ����
	 * JVM ���Ա�֤��ֻ������һ�Σ��Ӷ���֤���̰߳�ȫ
	 * @return
	 */
	public static Mgr07 getInstance() {
	
		return Mgr07Holder.INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda ���ʽ������ֻ��һ���ڲ�ֻ��һ������ʱ������������д
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr07.getInstance().hashCode());
			}).start();
		}

	}

}
