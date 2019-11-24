package Algorithms.BinaryTree;

import java.util.LinkedList;

public class BinaryTree {
    public BinaryTreeNode root;
    BinaryTree()
    {

    }

    public void setRoot(BinaryTreeNode node)
    {
        this.root = node;
    }
    static class BinaryTreeNode {
        String data;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;

        BinaryTreeNode(String data)
        {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public void preOrder(BinaryTreeNode t)
    {
        if(t != null)
        {
            System.out.println("data: "+t.data);
            preOrder(t.leftChild);
            preOrder(t.rightChild);
        }
    }

    public void inOrder(BinaryTreeNode t)
    {
        if(t != null)
        {
            inOrder(t.leftChild);
            System.out.println("data: "+t.data);
            inOrder(t.rightChild);
        }
    }

    public void postOrder(BinaryTreeNode t)
    {
        if(t != null)
        {
            postOrder(t.leftChild);
            postOrder(t.rightChild);
            System.out.println("data: "+t.data);
        }
    }

    public void levelOrder(BinaryTreeNode t)
    {
        LinkedList<BinaryTreeNode> layer = new LinkedList<>();
        while((t != null))
        {
            System.out.println("data: "+t.data);
            if(t.leftChild != null)
            {
                layer.add(t.leftChild);
            }
            if(t.rightChild != null)
            {
                layer.add(t.rightChild);
            }
            t = layer.poll();
        }
    }

    public int height(BinaryTreeNode t)
    {
        if(t == null)
        {
            return 0;
        }
        int heightLeft = height(t.leftChild);
        int heightRight = height(t.rightChild);
        if(heightLeft>heightRight)
        {
            return ++heightLeft;
        }
        else
        {
            return ++heightRight;
        }
    }
}