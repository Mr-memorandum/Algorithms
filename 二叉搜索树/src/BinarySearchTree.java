import java.util.Queue;

public class BinarySearchTree<Key extends Comparable<Key>,Value>{
        public treeNode root;// 二叉查找树的根结点

        private class treeNode {

            private Key key;// 键值
            private Value value;// 值
            private treeNode left, right;
            private int N;//该节点的左右节点数目
            treeNode(Key key, Value val, int N)
            {
                this.key = key;
                this.value = val;
                this.N = N;
            }
        }
        //构造函数
        public BinarySearchTree()
        {

        }
        //该节点构成的二叉树的节点总数（包括其自身）
        public int size()
        {
            return size(root);
        }

        private int size(treeNode x) {
            if (x == null)
            {
                return 0;
            }
            else {
                return x.N;
            }
        }
        //二叉查找某节点（按键值查询）
        public Value get(Key key) {
            return get(root, key);
        }

        private Value get(treeNode x, Key key) {
            if (x == null) {
                return null;
            }
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                return get(x.left, key);
            }
            else if (cmp > 0) {
                return get(x.right, key);
            }
            return x.value;
        }
        //插入节点
        public void put(Key key, Value value) {
            root = put(root, key, value);
        }

        private treeNode put(treeNode x, Key key, Value value) {
            if (x == null) {
                x = new treeNode(key, value, 1);
            }
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x.left = put(x.left, key, value);
            }
            else if (cmp > 0) {
                x.right = put(x.right, key, value);
            }
            else {
                x.value = value;
            }
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }
        //前序遍历输出
        public void preOrder(treeNode x)
        {
            if(x != null)
            {
                System.out.println("key值："+x.key+"节点值："+x.value+"该节点叶子节点数目："+x.N);
                preOrder(x.left);
                preOrder(x.right);
            }
        }
}
