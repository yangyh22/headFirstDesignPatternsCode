package chapter07_adapt_facade;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author yangyh
 * @date 2018/9/11
 */
public class EnumeratorIterator implements Iterator {

    Enumeration enum1;

    public EnumeratorIterator() {
    }

    public EnumeratorIterator(Enumeration enum1) {
        this.enum1 = enum1;
    }

    public boolean hasNext() {
        return enum1.hasMoreElements();
    }

    public Object next() {
        return enum1.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

}
