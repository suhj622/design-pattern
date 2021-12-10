/**
 * 
 */
package com.suhj.singletonNew;

/**
 * @author Haojie
 * 
 * Ҳ������ʽ
 * ��Ȼ�ﵽ�˰����ʼ����Ŀ�ģ���ȴ�����̲߳���ȫ������
 * ����ͨ�� synchronized �������Ҳ����Ч���½�
 * 
 */
public class Mgr06 {
	
	//��ָֹ����������
	private static volatile Mgr06 INSTANCE; //JIT
	
	private Mgr06() {};
	
	
	public static Mgr06 getInstance() {
		//��Ҫ����ж�����
		//�ܹ���������߳����ȴ�
		if (INSTANCE == null) {
			//˫�ؼ��
			synchronized (Mgr06.class) {
				if(INSTANCE == null) {
					try {
						//ÿ��ͣ�� 1 ����
						Thread.sleep(1);				
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					INSTANCE = new Mgr06();											
				}				
			}
		
		}
		return INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda ���ʽ������ֻ��һ���ڲ�ֻ��һ������ʱ������������д
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr06.getInstance().hashCode());
			}).start();
		}

	}

}
