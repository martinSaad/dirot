package com.martin.DAO;

import com.martin.entity.PotentialPost;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by martinsaad on 30/10/2016.
 */
public interface PotentialPostDAO extends CrudRepository<PotentialPost, Long> {
    PotentialPost findById(long id);
}
