package com.lugd.album.model;

import javax.validation.constraints.NotNull;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Song {
	
	@Id 
	@NotNull
	private String songId ;
	
	
	@Field 
	@NotNull
	private String songName;
	
}