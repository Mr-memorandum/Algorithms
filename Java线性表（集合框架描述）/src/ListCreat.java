import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListCreat<T> {
    private int length = 0;
    LinkedList<T> list = new LinkedList<>();

    public ListCreat()
    {
        this.length = 0;
    }

    int getLength()
    {
        return length;
    }

    void show()
    {
        System.out.println(list);
    }

    void addElement(int index,T element)
    {
        list.add(index,element);
        length++;
    }

    void addElement(T element)
    {
        list.add(element);
        length++;
    }

    void removeList(int index)
    {
        list.remove(index);
        length--;
    }

    void binaryShow(LinkedList<T> listAdd)
    {
        ListIterator<T> listIter = list.listIterator();
        for (T t : listAdd)
        {
            if (listIter.hasNext())
            {
                listIter.next();
            }
            listIter.add(t);
        }
        System.out.println(list);
    }

    void binaryRemove()
    {
        ListIterator listIter = list.listIterator();
        while(listIter.hasNext())
        {
            listIter.next();
            if(listIter.hasNext())
            {
                listIter.next();
                listIter.remove();
            }
        }
        System.out.println(list);
    }

    void clearOtherElement(LinkedList<T> Other)
    {
        this.list.removeAll(Other);
        System.out.println(this.list);
    }
}
