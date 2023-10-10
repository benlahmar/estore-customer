package com.example.demo;

public interface IDao<T, K> {

	public T save(T t);
	public T findById(K k);
}
