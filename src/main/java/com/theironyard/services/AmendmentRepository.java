package com.theironyard.services;

import com.theironyard.entities.Amendment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 11/22/16.
 */
public interface AmendmentRepository extends CrudRepository<Amendment, Integer>
{
}
