package StrategyPattern.impl;

import StrategyPattern.IStrategy;
/**
 * 策略三：实现类
 * @author oa_wenzongyuan
 *
 */
public class GivenGreenLightImpl implements IStrategy{

	@Override
	public <T> Object operator(T t){
       System.out.println("策略三方法执行了！！！！！！！！！");
	return t.toString();		
	}

}
