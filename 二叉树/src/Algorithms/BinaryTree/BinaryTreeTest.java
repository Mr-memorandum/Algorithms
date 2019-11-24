package Algorithms.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        BinaryTree.BinaryTreeNode nodeRoot = new BinaryTree.BinaryTreeNode("Physics");
        BinaryTree.BinaryTreeNode node1 = new BinaryTree.BinaryTreeNode("Mechanics");
        BinaryTree.BinaryTreeNode node2 = new BinaryTree.BinaryTreeNode("Electromagnetism");
        BinaryTree.BinaryTreeNode node3 = new BinaryTree.BinaryTreeNode("Thermodynamics");
        BinaryTree.BinaryTreeNode node4 = new BinaryTree.BinaryTreeNode("Fluid Mechanics");
        BinaryTree.BinaryTreeNode node5 = new BinaryTree.BinaryTreeNode("Electric Circuit");
        BinaryTree.BinaryTreeNode node6 = new BinaryTree.BinaryTreeNode("Analog Circuit");
        BinaryTree.BinaryTreeNode node7 = new BinaryTree.BinaryTreeNode("Digital Circuit");

        tree.setRoot(nodeRoot);
        tree.root.leftChild = node1;
        tree.root.rightChild = node2;
        node1.leftChild = node3;
        node1.rightChild = node4;
        node2.leftChild = node5;
        node5.leftChild = node6;
        node5.rightChild = node7;
        tree.levelOrder(tree.root);

        System.out.println("Height of the tree is "+tree.height(tree.root));
    }
}
