package com.theironyard.services;

import com.theironyard.entities.Bill;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 8/9/16.
 */
public interface BillRepository extends CrudRepository<Bill, Integer>
{
}
