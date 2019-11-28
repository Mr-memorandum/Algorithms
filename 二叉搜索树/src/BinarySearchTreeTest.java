public class BinarySearchTreeTest {
    public static void main(String[] args)
    {
        BinarySearchTree<String,Integer> newTree = new BinarySearchTree<>();
        newTree.put("D",1);
        newTree.put("B",2);
        newTree.put("C",3);
        newTree.put("A",4);
        newTree.put("G",7);
        newTree.put("E",5);
        newTree.put("F",6);
        newTree.preOrder(newTree.root);
    }
}
