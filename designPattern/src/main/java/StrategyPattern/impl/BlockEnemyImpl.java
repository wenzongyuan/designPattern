package StrategyPattern.impl;

import StrategyPattern.IStrategy;
/**
 * 策略二：实现类
 * @author oa_wenzongyuan
 *
 */
public class BlockEnemyImpl implements IStrategy{

	@Override
	public <T> Object operator(T t){
      System.out.println("策略二方法执行了！！！！！！");
	  return t.toString();		
	}

}
