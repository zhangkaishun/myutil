package kaishun.zks.test.�㷨.������;

public class BinaryTree {

	// �ڵ�ֵ
	private int value;
	// ��ڵ�
	private BinaryTree leftNode;
	// �ҽڵ�
	private BinaryTree rightNode;

	public BinaryTree(int value) {
		this.value = value;
	}

	//û�ж��ظ������ж�
	public void insertNode(BinaryTree root, int value) {
		if (root== null) {
			return;
		}
		if (root.getValue()>value) {
			if (root.getLeftNode() == null) {
				root.setLeftNode(new BinaryTree(value));
			} else {
				insertNode(root.getLeftNode(), value);
			}
		} else if (root.getValue()<value) {
			if (root.getRightNode() == null) {
				root.setRightNode(new BinaryTree(value));

			} else {
				insertNode(root.getRightNode(), value);
			}
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinaryTree getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BinaryTree leftNode) {
		this.leftNode = leftNode;
	}

	public BinaryTree getRightNode() {
		return rightNode;
	}

	public void setRightNode(BinaryTree rightNode) {
		this.rightNode = rightNode;
	}

}
