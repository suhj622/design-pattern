package com.suhj.singletonNew;

/**
 * 
 * @author Haojie
 * ����ʽ
 * ����ص��ڴ�󣬾�ʵ����һ��������JVM ��֤�̰߳�ȫ
 * ��ʵ�ã��Ƽ�ʹ�ã�
 * Ψһȱ�㣺�����õ������װ��ʱ�����ʵ����
 * ����˵�㲻�õģ���װ������ɶ��
 * 
 * ����һ�ַ�������ֻ�����࣬Class.forName("")
 */
public class Mgr01 {
	private static final Mgr01 INSTANCE = new Mgr01();
	
	private Mgr01() {};
	
	public static Mgr01 getInstance() { return INSTANCE; }
	
	public static void main(String[] args) {
		Mgr01 m1 = Mgr01.getInstance();
		Mgr01 m2 = Mgr01.getInstance();
		System.out.println(m1 == m2);
	}
}
