package GamePlatform.Abstracts;

public interface BaseRepository<T> {
    void add(T item) throws Exception;
    void update(T item);
    void delete(T item);
}
