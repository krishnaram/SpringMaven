package com.mindfiresolutions.springmaven.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfiresolutions.springmaven.models.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, Integer>{


}
