package com.Logate.SpringBootVjezba.repositories;

import com.Logate.SpringBootVjezba.DTO.DepartmentDTO;
import com.Logate.SpringBootVjezba.entities.Department;
import com.Logate.SpringBootVjezba.projection.DepartmentProjection;
import com.Logate.SpringBootVjezba.records.DepartmentRecord;
import jakarta.persistence.Tuple;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
//JPQL
    //SELECT * FROM DEPARTMENT
    /*
    @Query(value="select department from Department department", nativeQuery = false)
    public List<Department> findAll();

    //SELECT * FROM DEPARTMENT
    //WHERE ID = id

    @Query(value="select department from Department department where department.id = ?1")
    Optional<Department> findById(Integer id);

    //SELECT * FROM DEPARTMENT
    //WHERE DEPARMENT.NAME = NAME AND DEPARTMENT.DESCRIPTION = DESCRIPTION
@Query(value="select department from Department department where department.name = :name and department.description = :description")
    List<Department> findByNameAndDescription(@Param("name") String name, @Param("description") String description);


/////1. nacin da se salje nekoliko polja, vise od jedan je sa DTO KLASOM
    @Query(value="select new com.Logate.SpringBootVjezba.dto.DepartmentDTO(department.name, department.description from Department department " +
            "where department.name = :name")
    List<DepartmentDTO> deptNameAndDescDepartmentDTO(@Param("name") String name);
/////2. nacin je koristeci TUPLE Klasu
    @Query(value="select new com.Logate.SpringBootVjezba.dto.DepartmentDTO(department.name, department.description from Department department " +
        "where department.name = :name")
    List<Tuple> deptNameAndDescDepartmentDTOTuples(@Param("name") String name);

    /////3.nacin je putem Projectiona koji je Interface
    @Query(value="select department.name as name, department.description as description from Department department " +
            "where department.name = :name")
    List<DepartmentProjection> deptNameAndDescDepartmentDTOProjection(@Param("name") String name);

    /////4.records
    @Query(value="new com.Logate.SpringBootVjezba.dto.DepartmentDTO(department.name, department.description from Department department " +
            "where department.name = :name")
    List<DepartmentRecord> deptNameAndDescDepartmentDTORecord(@Param("name") String name);

////razlika izmedju dto klase i rekordsa
    ///record je immutable a DTO je mutable
    //kako povucemo info iz baze to je to. Ako hocemo samo povratne informacije, a ako hocemo da ih mije
    //njamo odna je najbolje da koristimo DTO

    /////QUERY PAGE PROBLEM
   @Query(value="select department from Department department " +
            "join fetch department.user " +
            "where department.name = :name", countQuery = "select count(department.id) from Department department where department.name = :name")
    Page<Department> findByNameWithPagingIssue(@Param("name") String name, Pageable pageable);

//QUERy PAGE RJESENJE
   /// @Query(value="select department.id from Department department where department.name = :name")
    Page<Integer> findByNameWithPagingIssue(@Param("name") String name, Pageable pageable);

    @Query(value="select department from Department department " +
            "join fetch department.user " +
            "where department.id in (:departmentIds)")
    List<Department> findByIdsPagingIssueSolved(@Param("departmentIds") List<Integer> departmentIds);

    @Modifying
    @Query(value="update Department department set department.description = :desc " +
            "where department.id = :id")
    Department updateById (@Param("desc") String desc, @Param("id") Integer id);

*/





}
