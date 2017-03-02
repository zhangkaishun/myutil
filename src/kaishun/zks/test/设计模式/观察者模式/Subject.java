package kaishun.zks.test.���ģʽ.�۲���ģʽ;

import java.util.ArrayList;
import java.util.List;

/**
 * ���۲���
 * 
 * @author zhangkaishun
 * 
 */
public class Subject {
	/** ���ڴ�Ź۲��� */
	List<Observer> list = new ArrayList<Observer>();

	int state;

	/**
	 * ���۲��߼��뵽list����
	 * 
	 * @param observer
	 *            �۲���
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
	 * ֪ͨ���й۲���
	 */
	public void notifyAllObserver() {
		for (Observer observer : list) {
			observer.sayState(state);
		}

	}
}
