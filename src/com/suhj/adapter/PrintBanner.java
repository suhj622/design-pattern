package com.suhj.adapter;

/**
 * PrintBanner ������������ɫ���ü̳еķ�ʽʵ����������ģʽ
 * �̳��� Banner ��
 * ʵ���� Print �ӿ�
 * @author Haojie
 *
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
