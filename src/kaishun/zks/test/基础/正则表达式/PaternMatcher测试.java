package kaishun.zks.test.����.������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class PaternMatcher���� {

	@Test
	public void testOne() {
		Pattern pattern = Pattern.compile("\\d+");
		String pattern2 = pattern.pattern(); // ����\d+
		System.out.println(pattern2);

		Matcher matcher = pattern.matcher("2222bbb34");
		//System.out.println(matcher.lookingAt()); // ����lookingAt()ֻ��ƥ��ǰ����ַ���,���Ե�ʹ��lookingAt()ƥ��ʱ
													// ����true
		while (matcher.find()) {
			System.out.println(matcher.group()); // �ֱ����2222 34
			System.out.println(matcher.start()); //ƥ�䵽���ַ����ĵ�һ���ַ�����
			System.out.println(matcher.end()); // ƥ�䵽���ַ��������һ���ַ�������
		}

	}
}
