package com.lugd.album.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lugd.album.model.Album;
import com.lugd.album.repository.AlbumRepository;


@Service
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumRepository albumRepository;
	@Override
	public Album addAlbum(Album book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Album> getAlbumById(int id) {
		// TODO Auto-generated method stub
		return albumRepository.findById(id);
		
	}

	@Override
	public Collection<Album> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album updateAlbum(Album album) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAlbum(int id) {
		// TODO Auto-generated method stub
		albumRepository.deleteById(id);
		
	}

	@Override
	public List<Album> getAlbums() {
		// TODO Auto-generated method stub
		List<Album> listAlbums = new ArrayList<Album>();
		 return (List<Album>) albumRepository.findAll();
	}

}
