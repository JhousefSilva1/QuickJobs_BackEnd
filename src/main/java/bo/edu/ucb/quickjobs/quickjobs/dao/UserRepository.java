/*
package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
* */

//package bo.edu.ucb.quickjobs.quickjobs.dao;
//
//
//import bo.edu.ucb.quickjobs.quickjobs.entity.User;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Select;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Component;
//
//
//@Component
//@EnableJpaRepositories
//public interface UserRepository extends JpaRepository<UserRepository, Long> {
package bo.edu.ucb.quickjobs.quickjobs.dao;

import bo.edu.ucb.quickjobs.quickjobs.entity.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository  {
//    List<User> getAll();
//
//    Optional<User> getByUser(String id);
//
//    User save (User user);
//
//    void delete (User user);

    @Select("Select qj_user_user FROM qj_user WHERE qj_user_user = ?1")
    List<User> findByName(@Param("user") String user);

    @Select("Select qj_user_password FROM qj_user WHERE qj_user_user = #{user}")
    String findByPaswordByUsername(String user);
}
