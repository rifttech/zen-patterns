package rifttech.behavioral.iterator;

/**
 * Created by Arthur Abramov on 03.12.2016.
 */
public interface Iterator<T> {
    T next();
    boolean hasNext();
}
