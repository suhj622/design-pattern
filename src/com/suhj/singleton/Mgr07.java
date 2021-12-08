/**
 * 
 */
package com.suhj.singleton;

/**
 * @author Haojie
 * 
 * 静态内部类方式 - 可以说最完美的方式
 * JVM 保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {
	

	private Mgr07() {};
	
	/**
	 * 
	 * @author Haojie
	 * 
	 * 静态内部类，在访问到时才会被加载进 JVM
	 * 
	 */
	private static class Mgr07Holder {
		private final static Mgr07 INSTANCE = new Mgr07();
	}
	
	/**
	 * 当访问该方法时，静态内部类加载进 JVM，并初始化 Mgr07 对象
	 * JVM 可以保证类只被加载一次，从而保证了线程安全
	 * @return
	 */
	public static Mgr07 getInstance() {
	
		return Mgr07Holder.INSTANCE;
	}
  
	public static void main(String[] args) {
		//lambda 表达式，对于只有一个内部只有一个方法时，可以这样简写
		for(int i = 0; i < 100; i++) {
			new Thread(()->{
				System.out.println(Mgr07.getInstance().hashCode());
			}).start();
		}

	}

}
