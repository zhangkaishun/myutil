package kaishun.zks.test.设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * 
 * @author zhangkaishun
 * 
 */
public class Subject {
	/** 用于存放观察者 */
	List<Observer> list = new ArrayList<Observer>();

	int state;

	/**
	 * 将观察者加入到list中来
	 * 
	 * @param observer
	 *            观察者
	 */
	public void attach(Observer observer) {
		list.add(observer);
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}

	/**
	 * 通知所有观察者
	 */
	public void notifyAllObserver() {
		for (Observer observer : list) {
			observer.sayState(state);
		}

	}
}
