/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过 synchronized 解决，但也带来效率下降
 */
public class Mgr05 {
	
	private static Mgr05 INSTANCE;
	
	private Mgr05() {};
	
	
	public static Mgr05 getInstance() {
		if (INSTANCE == null) {
			//妄图通过减小同步代码块的方式提高效率，然后不可行
			//在同步代码块之前，所有线程都拿到了 INSTANCE
			synchronized (Mgr05.class) {
				try {
					//每次停顿 1 毫秒
					Thread.sleep(1);				
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				INSTANCE = new Mgr05();					
			}
		
		}
		return INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda 表达式，对于只有一个内部只有一个方法时，可以这样简写
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr05.getInstance().hashCode());
			}).start();
		}

	}

}
