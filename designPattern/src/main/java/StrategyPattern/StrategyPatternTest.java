package StrategyPattern;

import org.junit.Test;

import StrategyPattern.impl.BackDoorImpl;

public class StrategyPatternTest {
	
	private StrategyContext strategyContext;

	@Test
	public void testStrategyPattern(){
		BackDoorImpl backDoorImpl=new BackDoorImpl();
		strategyContext=new StrategyContext(backDoorImpl);
		Object obj = strategyContext.operator("sfsdf");
		System.out.println(obj.toString());
		System.out.println("添加dealWith分支！！！！！！！！！");
		System.out.println("添加dev分支测试！！！！！！！！！！！！");
		System.out.println("添加dev分支测试111！！！！！！！！！！！！");
		System.out.println("添加dev分支合并！！！！！！！！！！！！！！！！！！！！");
		System.out.println("测试git bash 提交！！！！！！！！！！！！！！！！！！！！");
	}
}
