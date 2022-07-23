package Workshop2;

public interface BaseService<T> {
    void add (T item);
    void update (T item);
    void delete (T item);
    void get (T item);
}
