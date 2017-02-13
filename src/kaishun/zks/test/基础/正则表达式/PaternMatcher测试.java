package kaishun.zks.test.基础.正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class PaternMatcher测试 {

	@Test
	public void testOne() {
		Pattern pattern = Pattern.compile("\\d+");
		String pattern2 = pattern.pattern(); // 返回\d+
		System.out.println(pattern2);

		Matcher matcher = pattern.matcher("2222bbb34");
		//System.out.println(matcher.lookingAt()); // 由于lookingAt()只能匹配前面的字符串,所以当使用lookingAt()匹配时
													// 返回true
		while (matcher.find()) {
			System.out.println(matcher.group()); // 分别输出2222 34
			System.out.println(matcher.start()); //匹配到的字符串的第一个字符索引
			System.out.println(matcher.end()); // 匹配到的字符串的最后一个字符的索引
		}

	}
}
