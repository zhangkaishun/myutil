package kaishun.zks.test.���ģʽ.����ģʽ;

/**
 * ������
 * @author zhangkaishun
 *
 */
public class ProxyImage implements Image{
	private RealImage realImage;

	@Override
	public void display() {
		if(realImage==null){
			realImage=new RealImage();
		}
		realImage.display();
	}
	
}
