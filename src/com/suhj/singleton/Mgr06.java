/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可以通过 synchronized 解决，但也带来效率下降
 * 
 */
public class Mgr06 {
	
	//防止指令重排问题
	private static volatile Mgr06 INSTANCE; //JIT
	
	private Mgr06() {};
	
	
	public static Mgr06 getInstance() {
		//需要这个判断条件
		//能够避免大量线程锁等待
		if (INSTANCE == null) {
			//双重检查
			synchronized (Mgr06.class) {
				if(INSTANCE == null) {
					try {
						//每次停顿 1 毫秒
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
		//lambda 表达式，对于只有一个内部只有一个方法时，可以这样简写
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr06.getInstance().hashCode());
			}).start();
		}

	}

}
