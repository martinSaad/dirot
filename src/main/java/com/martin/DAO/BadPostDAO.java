package com.martin.DAO;

import com.martin.entity.BadPost;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

/**
 * Created by martinsaad on 30/10/2016.
 */
@Transactional
public interface BadPostDAO extends CrudRepository<BadPost, Long> {

    BadPost findById(long id);
}
