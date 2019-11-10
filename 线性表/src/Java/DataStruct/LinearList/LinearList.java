package Java.DataStruct.LinearList;

class LinearList<T> {
    private class node
    {
        T data;
        node next;
        node last;
    }
    private node head;
    private node tail;
    private int length;

    LinearList()
    {
        head = new node();
        tail = new node();
        head.next = tail;
        head.last = null;
        tail.next = null;
        tail.last = head;
        length = 0;
    }

    boolean emptyCheck()
    {
        return length == 0;
    }

    int size()
    {
        return length;
    }

    void addNode(T data)
    {
        tail.data = data;
        tail.next = new node();
        node temp = tail;
        tail = temp.next;
        tail.last = temp;
        tail.next = null;
        length++;
    }

    void remove(T data)
    {
        node temp = head.next;
        while(temp != tail)
        {
            //do not use "temp.data == data",which will cause 1 != 1.0
            if(temp.data.equals(data))
            {
                System.out.println("Target data "+data+" is removing...");
                node tempLast = temp.last;
                tempLast.next = temp.next;
                temp.next.last = tempLast;
                length--;
            }
            temp = temp.next;
        }
    }

    void removeLinearList()
    {
        if(length == 0)
        {
            System.out.println("LinearList is empty.");
        }
        else
        {
            node temp = head.next;
            while(temp != tail)
            {
                temp = temp.next;
                length--;
            }
            head.next = tail;
            tail.last = head;
            System.out.println("Length is "+length);
        }
        if(length == 0)
        {
            System.out.println("removing all finished.");
        }
    }

    void show()
    {
        if(length == 0)
        {
            System.out.println("Linear list is empty.");
        }
        else
        {
            node temp = head.next;
            while(temp != (tail.last))
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    void reverseShow()
    {
        if(length == 0)
        {
            System.out.println("Linear list is empty.");
        }
        else
        {
            System.out.println("reverse outputting...");
            node temp = tail.last;
            while(temp != (head.next))
            {
                System.out.print(temp.data+"->");
                temp = temp.last;
            }
            System.out.println(temp.data);
        }
    }

}
