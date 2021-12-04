package com.suhj.adapter;

/**
 * PrintBanner 扮演适配器角色，用继承的方式实现了适配器模式
 * 继承了 Banner 类
 * 实现了 Print 接口
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
