package StrategyPattern;
/**
 * 策略接口
 * @author oa_wenzongyuan
 *
 */
public interface IStrategy {
	//策略方法
   public <T> Object operator(T t);
}
