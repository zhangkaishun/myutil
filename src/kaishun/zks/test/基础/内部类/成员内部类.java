package kaishun.zks.test.����.�ڲ���;

/*
������ͨ���࣬���õ����η���final��abstract��strictfp��public��Ĭ�ϵİ����ʡ�
���ǳ�Ա�ڲ������һ����Ա�����ͷ�����
���õ����η��У�final��abstract��public��private��protected��strictfp��static��
һ����static�����ڲ��࣬���ͱ�ɾ�̬�ڲ�����*/
public class ��Ա�ڲ��� {

	String name;
	public class Inner{
		public int i;
		public int j;
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		public int getJ() {
			return j;
		}
		public void setJ(int j) {
			this.j = j;
		}
		public void sayHello(){
			System.out.println(this); //����Inner ��ǰ����
			System.out.println(��Ա�ڲ���.this); //���� ��Ա�ڲ��൱ǰ����
			System.out.println("��Ա�ڲ��� hello world");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args){
		��Ա�ڲ��� outer=new ��Ա�ڲ���();
		��Ա�ڲ���.Inner in = outer.new Inner();
		//��Ա�ڲ���.Inner inTwo=new ��Ա�ڲ���().new Inner(); ���пɴ���ǰ������
		in.sayHello();
		
	}
	
}
