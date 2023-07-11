package TEST;

public class LinkedList <E>
{
    private final E data;
    private LinkedList ptr;

    public LinkedList (E data, LinkedList ptr)
    {
        this.data = data;
        this.ptr = ptr;
    }

    public E poll()
    {
        return data;
    }

    public LinkedList pollPtr()
    {
        return ptr;
    }
}
