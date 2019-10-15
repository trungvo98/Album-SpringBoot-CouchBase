package com.lugd.album.model;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.couchbase.core.mapping.Document;


import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@Document

public class Album {
	
   @Id	
   private  int albId  ; 

   @Size(min=20)
   @NotNull
   @Field
   private String albName ; 
   
   @NotNull
   @Field
   private String author ;
   
   @Field
   private Date date;

   @Field 
   private List<Song> songList ;
   
}
