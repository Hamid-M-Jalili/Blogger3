
package com.sg.Blogger3.Respositores;

import com.sg.Blogger3.entities.HashTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashTagsRepository extends JpaRepository<HashTags, Integer>{
    
}
