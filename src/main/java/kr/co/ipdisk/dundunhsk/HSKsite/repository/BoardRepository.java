package kr.co.ipdisk.dundunhsk.HSKsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.ipdisk.dundunhsk.HSKsite.data.entitySet.BoardEntity;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    
}