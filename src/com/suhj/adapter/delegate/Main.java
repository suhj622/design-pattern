package com.suhj.adapter.delegate;

import com.suhj.adapter.Print;
import com.suhj.adapter.PrintBanner;

public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}


}
