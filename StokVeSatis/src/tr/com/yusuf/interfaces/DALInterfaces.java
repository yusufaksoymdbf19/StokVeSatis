package tr.com.yusuf.interfaces;

import java.util.List;

public interface DALInterfaces<T>{
	public void insert(T entity);
	public List<T> getAll();
	public T delete(T entity);
	public void update(T entity);
	public List<T> getById(int id);
}