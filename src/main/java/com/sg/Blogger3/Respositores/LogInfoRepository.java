package com.sg.Blogger3.Respositores;

import com.sg.Blogger3.entities.LogInfo;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LogInfoRepository extends JpaRepository<LogInfo, Integer>{
    
    
    
}
