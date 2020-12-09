package Trees;
public class BinaryTreeNode {
    private int data;
    private BinaryTreeNode leftNode = null;
    private BinaryTreeNode rightNode = null;

    public BinaryTreeNode(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftNode() {
        return this.leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return this.rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}