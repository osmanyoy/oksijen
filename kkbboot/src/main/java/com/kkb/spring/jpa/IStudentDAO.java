package com.kkb.spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface IStudentDAO extends CrudRepository<StudentExtra, Long> {

    List<StudentExtra> findByName(String name);

    List<StudentExtra> findByNameAndSurname(String name,
                                            String surname);

    List<StudentExtra> findByNameIn(List<String> names);

    @Query("select s from StudentExtra s where s.name=:isim")
    List<StudentExtra> testQuery(@Param("isim") String name);

    @Modifying
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    @Query("update StudentExtra s set s.name=:name where s.stId=:id")
    void yenile(@Param("name") String name,
                @Param("id") long stId);

    @Query(value = "select * from StudentExtra where name=:isim", nativeQuery = true)
    List<StudentExtra> testQuery2(@Param("isim") String name);

    List<StudentExtra> select1();


}
