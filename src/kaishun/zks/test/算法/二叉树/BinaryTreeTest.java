package kaishun.zks.test.算法.二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinaryTreeTest {
	private static BinaryTree rootTree = null;
	static {
		rootTree = new BinaryTree(50);
		rootTree.insertNode(rootTree, 46);
		rootTree.insertNode(rootTree, 58);
		rootTree.insertNode(rootTree, 43);
		rootTree.insertNode(rootTree, 47);
		rootTree.insertNode(rootTree, 52);
		rootTree.insertNode(rootTree, 60);
	}

	// 前序遍历测试
	@Test
	public void testPreOrder() {
		List<Integer> list = new ArrayList<Integer>();
		this.preOrder(rootTree, list);
		System.out.println(Arrays.toString(list.toArray()));
		// 结果：[50, 46, 43, 47, 58, 52, 60]
	}

	/**
	 * 前序遍历
	 * 
	 * @param rootTree
	 *            根节点
	 * @param list
	 *            用于保存值
	 */
	public void preOrder(BinaryTree rootTree, List<Integer> list) {
		if (rootTree == null) {
			return;
		}
		list.add(rootTree.getValue());
		if (rootTree.getLeftNode() != null) {
			preOrder(rootTree.getLeftNode(), list);
		}
		if (rootTree.getRightNode() != null) {
			preOrder(rootTree.getRightNode(), list);
		}
	}

	// 测试中序遍历
	@Test
	public void testInOrder() {
		List<Integer> list = new ArrayList<Integer>();
		this.inOrder(rootTree, list);
		System.out.println(Arrays.toString(list.toArray()));
		// 结果：[43, 46, 47, 50, 52, 58, 60]
	}

	/**
	 * 中序遍历
	 * 
	 * @param rootTree
	 *            根节点
	 * @param list
	 *            用于保存值
	 */
	public void inOrder(BinaryTree rootTree, List<Integer> list) {
		if (rootTree.getLeftNode() != null) {
			inOrder(rootTree.getLeftNode(), list);
		}
		list.add(rootTree.getValue());
		if (rootTree.getRightNode() != null) {
			inOrder(rootTree.getRightNode(), list);
		}
	}

	//测试后续遍历
	@Test
	public void testAfterOrder(){
		List<Integer> list=new ArrayList<Integer>();
		this.afterOrder(rootTree, list);
		System.out.println(Arrays.toString(list.toArray()));
		//结果：[43, 47, 46, 52, 60, 58, 50]
	}
	/**
	 * 后续遍历
	 * 
	 * @param rootTree
	 *            根节点
	 * @param list
	 *            用于保存值
	 */
	public void afterOrder(BinaryTree rootTree, List<Integer> list) {
		if (rootTree.getLeftNode() != null) {
			afterOrder(rootTree.getLeftNode(), list);
		}
		if (rootTree.getRightNode() != null) {
			afterOrder(rootTree.getRightNode(), list);
		}
		list.add(rootTree.getValue());
	}

}
