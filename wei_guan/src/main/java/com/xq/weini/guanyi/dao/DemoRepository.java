package com.xq.weini.guanyi.dao;

import com.xq.weini.guanyi.entity.po.DemoPO;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DemoRepository extends JpaRepository<DemoPO,Long> {


  @Query(value="select * from demopo limit 0,2" ,nativeQuery= true )
  List<DemoPO> findBySql();

  @Query(value="select * from demopo WHERE id=?1" ,nativeQuery= true )
  List<DemoPO> findByCuster(Long id);

  @Query(value="select * from demopo limit ?1 ,?2 " ,nativeQuery= true )
  List<DemoPO> findBySql(int start ,int end);


  @Modifying
  @Transactional
  @Query(value="UPDATE demopo  SET NAME='lisansan' WHERE ID =  ?1" ,nativeQuery= true )
  int updateBySql(Long id);

}
