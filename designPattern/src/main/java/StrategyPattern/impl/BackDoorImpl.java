package StrategyPattern.impl;

import StrategyPattern.IStrategy;
/**
 * 策略一：实现类
 * @author oa_wenzongyuan
 *
 */
public class BackDoorImpl implements IStrategy{

	@Override
	public <T> Object operator(T t) {
		System.out.println("策略一方法执行了！！！！                      ");
		return t.toString();
	}

}
