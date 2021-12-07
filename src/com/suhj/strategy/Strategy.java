/**
 * 
 */
package com.suhj.strategy;

/**
 * @author Haojie
 * 
 * 表示猜拳游戏中的策略的接口
 */
public interface Strategy {
	/**
	 * 获取下一局要出的手势
	 * @return
	 */
	public abstract Hand nextHand();
	/**
	 * 学习 “上一局的手势是否获胜了”
	 * 如果在上一局中调用 nextHand 方法获取了，就接着调用 study(true)
	 * 如果输了，就接着调用 study(false)
	 * 这样，Strategy 接口的实现类就会改变自己的内部状态，从而为下一次 nextHand 被调用时是返回 “石头” “剪刀” 还是 “布” 提供判断依据
	 * @param win
	 */
	public abstract void study(boolean win);
}
