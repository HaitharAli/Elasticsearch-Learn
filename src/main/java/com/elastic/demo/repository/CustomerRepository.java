package com.elastic.demo.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.elastic.demo.model.Customer;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {

	List<Customer> findByFirstName(String firstName);

}
