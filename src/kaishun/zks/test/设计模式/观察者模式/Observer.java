package kaishun.zks.test.���ģʽ.�۲���ģʽ;

/**
 * �۲���
 * @author zhangkaishun
 *
 */
public abstract class Observer {
	//�۲�������
	public String name;
	//���۲���
	public Subject subject;
	public abstract void sayState(int state);
}
