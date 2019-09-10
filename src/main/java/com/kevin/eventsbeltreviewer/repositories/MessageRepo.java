package com.kevin.eventsbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevin.eventsbeltreviewer.models.Message;

@Repository
public interface MessageRepo extends CrudRepository <Message, Long>{

}