package kaishun.zks.test.common;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.junit.Test;

public class BigDecimalTest {
	
	/**
	 * 加减乘除
	 */
	@Test
	public void test() {
		try {
			BigDecimal big = new BigDecimal("3.56548525445");
			BigDecimal big2 = new BigDecimal("2.56548525445");
			// BigDecimal add = big.add(big2); //加

			// BigDecimal add = big.subtract(big2); //减

			// BigDecimal add=big.multiply(big2); //乘
			BigDecimal add = big.divide(new BigDecimal("2")); // 除

			System.out.println(add);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 保留小数位数
	 */
	@Test
	public void 保留小数位数(){
		 double   c=125543111.154215;
		 //取所有整数以及两位小数 如果整数不足两位，则用0填充到两位
		DecimalFormat format=new DecimalFormat("00.00");
		System.out.println(format.format(c));
		//整数部分和三维小数
		DecimalFormat format2=new DecimalFormat("#.000");
		System.out.println(format2.format(c)); 
		//整数部分每三位以，间隔
		System.out.println(new DecimalFormat(",###").format(c));
		
		//取所有整数部分 
		System.out.println(new DecimalFormat("#").format(c));  
		//以百分比方式计数，并取两位小数  
		System.out.println(new DecimalFormat("#.##%").format(c));
		//显示为科学计数法，并取五位小数  
		System.out.println(new DecimalFormat("#.#####E0").format(c));
	//显示为两位整数的科学计数法，并取四位小数  
		System.out.println(new  DecimalFormat("00.####E0").format(c));
		//将格式嵌入文本  
		System.out.println(new DecimalFormat("光速大小为每秒,###米。").format(c));
		
		//保留两位小数，四舍五入
		BigDecimal bigDe=new BigDecimal(12554.345455);
		System.out.println(bigDe.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
		
	}
	/** 
	 * ceil  向上取整
	 * floor 向下取整
	 * round	四舍五入
	 */
	@Test
	public void testTwo(){
		try{
		double i=2.999;
		double j=3232.12221;
		double k=3344343.56464;

		//向上取整
		System.out.println(Math.ceil(i));
		System.out.println(Math.ceil(j));
		System.out.println(Math.ceil(k));
		System.out.println("---------------");
		//向下取整
		System.out.println(Math.floor(i));
		System.out.println(Math.floor(j));
		System.out.println(Math.floor(k));
		//四舍五入
		System.out.println(Math.round(i));
		System.out.println(Math.round(j));
		System.out.println(Math.round(k));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
