/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * lazy loading
 * Ҳ������ʽ
 * ��Ȼ�ﵽ�˰����ʼ����Ŀ�ģ���ȴ�����̲߳���ȫ������
 */
public class Mgr03 {
	private static Mgr03 INSTANCE;
	
	private Mgr03() {};
	
	public static Mgr03 getInstance() {
		if (INSTANCE == null) {			
			try {
				//ÿ��ͣ�� 1 ����
				Thread.sleep(1);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr03();			
		}
		return INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda ���ʽ������ֻ��һ���ڲ�ֻ��һ������ʱ������������д
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr03.getInstance().hashCode());
			}).start();
		}

	}

}
