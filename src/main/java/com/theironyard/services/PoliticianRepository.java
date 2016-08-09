package com.theironyard.services;

import com.theironyard.entities.Politician;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 8/9/16.
 */
public interface PoliticianRepository extends CrudRepository<Politician, Integer>
{
}
