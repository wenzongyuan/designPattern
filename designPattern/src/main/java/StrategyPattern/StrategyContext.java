package StrategyPattern;
/**
 * 策略容器类
 * @author oa_wenzongyuan
 *
 */
public class StrategyContext {
  
	//维护一个策略接口变量
	private IStrategy strategy;
	
	//构造函数
	public StrategyContext(IStrategy strategy){
		this.strategy=strategy;
	}
	
	//调用策略方法
	public <T> Object operator(T t){
		return this.strategy.operator(t);
	}
}
