
//PlaylistInfoRepository
package com.icia.semi.dao;

import com.icia.semi.dto.PlaylistInfoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistInfoRepository extends JpaRepository<PlaylistInfoEntity, Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE PlaylistInfoEntity p SET p.PInfoHit = p.PInfoHit + 1 WHERE p.PInfoNum = :pNum")
    void incrementPHit(@Param("pNum") int pNum);

    @Query("SELECT p FROM PlaylistInfoEntity p WHERE p.user.userId = :userId")
    List<PlaylistInfoEntity> findAllByUserId(@Param("userId") String userId);


}
