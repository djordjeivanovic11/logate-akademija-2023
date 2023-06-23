package com.Logate.SpringBootVjezba.repositories;

import com.Logate.SpringBootVjezba.DTO.DepartmentDTO;
import com.Logate.SpringBootVjezba.entities.User;
import com.Logate.SpringBootVjezba.projection.UserProjection;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.expression.spel.ast.Projection;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface IUserInterface extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

    /*


    //////JPA QUERIES/////////
    //SELECT * FROM USER
    List<User> findAll();

    //SELECT * FROM USER
    //WHERE USER.ID = ID;
    User getByID(Integer id);

    //SELECT * FROM USER
    //WHERE USER.first_name = firstName & user.last_name = lastName;
    List<User> findByFirstNameAndLastName(String firstName, String lastName);

    //SELECT * FROM USER
    //WHERE USER.first_name = firstName & user.last_name = lastNam ^ user_name = userName;

    User findByFirstNameAndLastNameAndUsername(String firstName, String lastName, String username);
      //SELECT * FROM USER
    //WHERE first_name like '%startWithName'

    List<User> findByFirstNameStartingWith(String startWithName);

    //SELECT * FROM USER
    //WHERE first_name like '%endsWithName'

    List<User> findByFirstNameEndingWith(String endingWith);

    //SELECT * FROM USER
    //JOIN DEPARTMENT ON USER.department_id = DEPARTMENT.id
    //WHERE department.name like '%middleName%'
    List<User> findByDepartmentNameContaining(String middleName);

    //SELECT * FROM USER
    //JOIN DEPARTMENT ON USER.department_id = DEPARTMENT.id
    //WHERE USER.username like 'username' and DEPARTMENT.name = 'department'
    /*User findByUserNameLikeAndDepartmentName(String username, String department);*/

    //////////JPQL//////////////
    //MI pisemo upit ali na JPQL

    /*@Query(value="select user from User user join user.department on department " +
            "where department.name = :name and user.username like :username")
    List<User> findByUsernameLikeAndDepartmentName(@Param("name") String name, @Param("username") String username);


    @Query(value="select user from User user " +
            "join fetch user.department on department " +
            "where department.description not like :description and user.firstName=:firstName ")
    List<User> findByDepartmentDescriptionAndFirstName(@Param("description") String description, @Param("firstname") String firstName);

    @Query(value="select user from User user " +
                    "join user.department on department " +
                    "where department.description = :description and department.name = :name")
List<User> getByDepartmentDescriptionAndName(@Param("description") String description, @Param("name") String name);
    @Query(value="select user from User user " +
            "where user.firstName = :firstName")
    List<User> getUserByFisrtName(@Param("firstName") String firstName);


    ///SELECT DEPT_NAME FROM DEPARTMENT
    //WHERE DEPARTMENT.NAME = NAME
    //jedan string vracam no prob

    @Query(value="select department from Department department" +
            "where department.name = name")
    List<String>  getByDepartmentNameString(@Param("name") String name);

    //1.DTO KONSTRUKTOR

    ///SELECT DEPT_NAME, dept.description FROM DEPARTMENT
    //WHERE DEPARTMENT.NAME = NAMe
    //sta kad vracamo vise od 1
    @Query(value="select new com.Logate.SpringBootVjezba.dto.DepartmentDTO(department.name, department.description from Department department " +
            "where department.name = :name")
    List<DepartmentDTO> deptNameAndDescDepartmentDTO(@Param("name") String name);

    @Query(value="select user from User user where user.firstName = :firstName")
      Page<User> getAllUserPage(@Param("firstName") String firstName, Pageable pageable);

/////NATIVNI SQL KORISTIMO SAMO KAD JE BAS KOMPLIKOVAN UPIT I KAD IMA SUM, AVERAGE FUNKCIJE I SL
    @Query(value="select first_name firstName, last_name lastName, age " +
            "from User user where user.name = :userName", nativeQuery = true)
    List<UserProjection> getUserByNameNative(@Param("name") String name);
*/
}
