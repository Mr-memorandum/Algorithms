public class LinkedListTest {
    public static void main(String[] args)
    {
        ListCreat<String> a = new ListCreat<>();
        ListCreat<String> b = new ListCreat<>();
        a.addElement("Alice");
        a.addElement("Bob");
        a.addElement("Ceil");
        a.addElement("Gloria");
        b.addElement("001");
        b.addElement("002");
        b.addElement("003");
        b.addElement("004");
        b.addElement("005");
        System.out.println("Insert b to a:");
        a.binaryShow(b.list);
        System.out.println("Length of a is "+a.getLength());
        System.out.println("Binary removing b:");
        b.binaryRemove();
        System.out.println("clear b element from a:");
        a.clearOtherElement(b.list);
    }
}
