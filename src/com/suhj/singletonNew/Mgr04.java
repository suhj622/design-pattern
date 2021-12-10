/**
 * 
 */
package com.suhj.singletonNew;

/**
 * @author Haojie
 * 
 * lazy loading
 * Ҳ������ʽ
 * ��Ȼ�ﵽ�˰����ʼ����Ŀ�ģ���ȴ�����̲߳���ȫ������
 * ����ͨ�� synchronized �������Ҳ����Ч���½�
 */
public class Mgr04 {
	
	private static Mgr04 INSTANCE;
	
	private Mgr04() {};
	
	public static synchronized Mgr04 getInstance() {
		if (INSTANCE == null) {			
			try {
				//ÿ��ͣ�� 1 ����
				Thread.sleep(1);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr04();			
		}
		return INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda ���ʽ������ֻ��һ���ڲ�ֻ��һ������ʱ������������д
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr04.getInstance().hashCode());
			}).start();
		}

	}

}
