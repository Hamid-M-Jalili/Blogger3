
package com.sg.Blogger3.Respositores;

import com.sg.Blogger3.entities.PostContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostContentRepository extends JpaRepository<PostContent, Integer>{
    
}
