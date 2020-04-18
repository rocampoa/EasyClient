package com.easyclient.repositories;

import com.easyclient.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepostitory extends JpaRepository<PersonEntity, Integer> {

}
