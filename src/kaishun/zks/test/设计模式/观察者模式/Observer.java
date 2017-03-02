package kaishun.zks.test.设计模式.观察者模式;

/**
 * 观察者
 * @author zhangkaishun
 *
 */
public abstract class Observer {
	//观察者名字
	public String name;
	//被观察者
	public Subject subject;
	public abstract void sayState(int state);
}
