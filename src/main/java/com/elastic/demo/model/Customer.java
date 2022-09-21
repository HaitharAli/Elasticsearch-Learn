package com.elastic.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName = "haithar-clust", shards = 2,createIndex = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int age;

}
