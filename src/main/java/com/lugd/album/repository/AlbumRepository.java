package com.lugd.album.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.View;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.lugd.album.model.Album;
@Repository
public interface AlbumRepository extends  PagingAndSortingRepository<Album, Integer> {
	
	
	@View(viewName = "byName")
	public  List<Album> findByAuthor(String author);

}
