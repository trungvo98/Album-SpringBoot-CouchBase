package com.lugd.album.repository;

import org.springframework.data.repository.CrudRepository;

import com.lugd.album.model.Album;

public interface AlbumRepository extends CrudRepository<Album, Integer> {
	
	public  Album findByAuthor(String author);

}
