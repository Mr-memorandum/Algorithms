package Java.DataStruct.LinearList;

public class LinearListTest {
    public static void main(String[] args)
    {
        LinearList<java.io.Serializable> list = new LinearList<>();
        list.addNode("Mr.Liang is an engineer.");
        list.addNode(1.00);
        list.addNode("She is a doctor.");
        list.show();
        list.remove(1.0);
        list.show();
        list.addNode("I like welsh corgi pembroke.");
        list.reverseShow();
        list.removeLinearList();
    }
}
