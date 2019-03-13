package com.notifications.notifications.genericDAO;

import java.util.List;

public interface GenericDAO<T> {

    public T getById(Long id);

    public List<T> getAll();

    public T saveOrUpdate(T entity);

    public boolean deleteById(Long id);
}
