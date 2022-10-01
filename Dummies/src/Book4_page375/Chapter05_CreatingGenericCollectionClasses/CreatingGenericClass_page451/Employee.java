package Book4_page375.Chapter05_CreatingGenericCollectionClasses.CreatingGenericClass_page451;

public class Employee<E> extends ArrayList{
    private E o;

    public boolean add(E o)
    {
        this.o = o;
// body of method omitted (thank you)
        return false;
    }

    public E get(int index)
    {
// body of method omitted (you're welcome)
        return null;
    }

    public Object clone()
    {
        try
        {
            ArrayList v = (ArrayList) super.clone();
            int size = 0;
            v.setElementData(new Object[size]);
            System.arraycopy(getElementData(), 0,
                    v.getElementData(), 0, size);
            v.modCount = 0;
            return v;
        }
        catch (CloneNotSupportedException e)
        {
// this shouldn't happen since we're Cloneable
            throw new InternalError();
        }
    }

    public E getO() {
        return o;
    }

    public void setO(E o) {
        this.o = o;
    }
}
