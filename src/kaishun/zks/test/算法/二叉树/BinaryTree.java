package kaishun.zks.test.算法.二叉树;

public class BinaryTree {

	// 节点值
	private int value;
	// 左节点
	private BinaryTree leftNode;
	// 右节点
	private BinaryTree rightNode;

	public BinaryTree(int value) {
		this.value = value;
	}

	//没有对重复进行判断
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
