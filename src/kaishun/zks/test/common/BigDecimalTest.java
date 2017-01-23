package kaishun.zks.test.common;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.junit.Test;

public class BigDecimalTest {
	
	/**
	 * �Ӽ��˳�
	 */
	@Test
	public void test() {
		try {
			BigDecimal big = new BigDecimal("3.56548525445");
			BigDecimal big2 = new BigDecimal("2.56548525445");
			// BigDecimal add = big.add(big2); //��

			// BigDecimal add = big.subtract(big2); //��

			// BigDecimal add=big.multiply(big2); //��
			BigDecimal add = big.divide(new BigDecimal("2")); // ��

			System.out.println(add);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����С��λ��
	 */
	@Test
	public void ����С��λ��(){
		 double   c=125543111.154215;
		 //ȡ���������Լ���λС�� �������������λ������0��䵽��λ
		DecimalFormat format=new DecimalFormat("00.00");
		System.out.println(format.format(c));
		//�������ֺ���άС��
		DecimalFormat format2=new DecimalFormat("#.000");
		System.out.println(format2.format(c)); 
		//��������ÿ��λ�ԣ����
		System.out.println(new DecimalFormat(",###").format(c));
		
		//ȡ������������ 
		System.out.println(new DecimalFormat("#").format(c));  
		//�԰ٷֱȷ�ʽ��������ȡ��λС��  
		System.out.println(new DecimalFormat("#.##%").format(c));
		//��ʾΪ��ѧ����������ȡ��λС��  
		System.out.println(new DecimalFormat("#.#####E0").format(c));
	//��ʾΪ��λ�����Ŀ�ѧ����������ȡ��λС��  
		System.out.println(new  DecimalFormat("00.####E0").format(c));
		//����ʽǶ���ı�  
		System.out.println(new DecimalFormat("���ٴ�СΪÿ��,###�ס�").format(c));
		
		//������λС������������
		BigDecimal bigDe=new BigDecimal(12554.345455);
		System.out.println(bigDe.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		
	}
	/** 
	 * ceil  ����ȡ��
	 * floor ����ȡ��
	 * round	��������
	 */
	@Test
	public void testTwo(){
		try{
		double i=2.999;
		double j=3232.12221;
		double k=3344343.56464;

		//����ȡ��
		System.out.println(Math.ceil(i));
		System.out.println(Math.ceil(j));
		System.out.println(Math.ceil(k));
		System.out.println("---------------");
		//����ȡ��
		System.out.println(Math.floor(i));
		System.out.println(Math.floor(j));
		System.out.println(Math.floor(k));
		//��������
		System.out.println(Math.round(i));
		System.out.println(Math.round(j));
		System.out.println(Math.round(k));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
