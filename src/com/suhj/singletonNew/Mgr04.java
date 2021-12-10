/**
 * 
 */
package com.suhj.singletonNew;

/**
 * @author Haojie
 * 
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过 synchronized 解决，但也带来效率下降
 */
public class Mgr04 {
	
	private static Mgr04 INSTANCE;
	
	private Mgr04() {};
	
	public static synchronized Mgr04 getInstance() {
		if (INSTANCE == null) {			
			try {
				//每次停顿 1 毫秒
				Thread.sleep(1);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			INSTANCE = new Mgr04();			
		}
		return INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda 表达式，对于只有一个内部只有一个方法时，可以这样简写
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr04.getInstance().hashCode());
			}).start();
		}

	}

}
