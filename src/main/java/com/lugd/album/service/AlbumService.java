package com.lugd.album.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.lugd.album.model.Album;

public interface AlbumService {
        
	Album addAlbum(Album book);
	Optional<Album> getAlbumById(int id);
	Collection<Album> findByAuthor(String author);
	Album updateAlbum(Album album);
	void deleteAlbum(int id);
	
	List<Album> getAlbums();
}
