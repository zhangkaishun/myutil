package kaishun.zks.test.设计模式.代理模式;

/**
 * 代理类
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
