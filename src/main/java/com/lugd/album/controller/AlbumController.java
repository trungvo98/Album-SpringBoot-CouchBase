package com.lugd.album.controller;

import java.util.List;
import java.util.Optional;
import com.lugd.album.model.Album;
import com.lugd.album.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {
	
	@Autowired
	AlbumRepository albumRepository ;
	
	
	@RequestMapping("/")
	public String index() {
		return "This is index";
	}
	
	// get all lists album
	@GetMapping("/album")
	public List<Album> fetchAll() {
		return  (List<Album>) albumRepository.findAll(); 
	

	}
	
	// find album by id
	@GetMapping("/album/{id}")
	public Optional<Album> findAlbumById(@PathVariable String id) {
		int albId=Integer.parseInt(id);
		if(albumRepository.existsById(albId)) {
			return albumRepository.findById(albId);
			
		}else {
			return Optional.empty();
		}
	}
	
	// find album by author 
	@GetMapping("/album/author/{author}")
	/*public Album findAlbumByAuthor(@PathVariable String author){
		return albumRepository.findByAuthor(author);
	}*/
	
	
	//create a album 
	@PutMapping("/album")
	public Album create (@RequestBody Album newAlbum) {
		return albumRepository.save(newAlbum);
	}
	
	
	
	
	@PutMapping("/album/{id}")
  /* public String update(@PathVariable String idToBeUpdated, @RequestBody AlbumUpdateRequest albumUpdateRequest) {
        
        Optional<Album> mayBeAlbum = albumRepository.findById(idToBeUpdated)
                .map(album -> albumRepository
                        .save(Album
                                .builder()
                                .id(idToBeUpdated)
                                .name(albumUpdateRequest.getName())
                                .date(albumUpdateRequest.getDate())
                                .author(album.getAuthor())
                                .build())
                );
        if (mayBeAlbum.isPresent()) {
            return "Blog Updated";
        } else {
            return "Blog does not exist";
        }
    }*/
	
	@DeleteMapping("/album/{id}")
	public void delete(@PathVariable String id) {
		int albId=Integer.parseInt(id);
		 albumRepository.deleteById(albId);
		
	}
	
}
