package com.Logate.SpringBootVjezba.specification;

import com.Logate.SpringBootVjezba.Filters.UserSearchFilter;
import com.Logate.SpringBootVjezba.entities.Department;
import com.Logate.SpringBootVjezba.entities.User;
import jakarta.persistence.criteria.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class UserSpecifications implements Specification<User> {

    private final UserSearchFilter userSearchFilter;

    public UserSpecifications(UserSearchFilter userSearchFilter) {
        this.userSearchFilter = userSearchFilter;
    }

    @Override
    public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        filterByFirstName(root, criteriaBuilder, predicates);
        filterByLastName(root, criteriaBuilder, predicates);
        filterByAge(root, criteriaBuilder, predicates);

        criteriaBuilder.and(predicates.toArray(new Predicate [predicates.size()] ));
        return null;
    }


    private void filterByAge(Root<User> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates) {
        if(userSearchFilter.getAge() != null){
            Predicate predicate = criteriaBuilder.equal(root.get("age"), userSearchFilter.getAge());
            predicates.add(predicate);
        }
            Predicate predicate = criteriaBuilder.equal(root.get("firstName"), userSearchFilter.getFirstName());
            predicates.add(predicate);
    }

    private void filterByLastName(Root<User> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates) {
        if(StringUtils.isNoneBlank(userSearchFilter.getLastName())){
            Predicate predicate = criteriaBuilder.equal(root.get("lastName"), userSearchFilter.getLastName());
            predicates.add(predicate);
    }

    }

    private void filterByFirstName(Root<User> root, CriteriaBuilder criteriaBuilder, List<Predicate> predicates) {
        if (StringUtils.isNoneBlank(userSearchFilter.getFirstName())) {
            Predicate predicate = criteriaBuilder.equal(root.get("firstName"), userSearchFilter.getFirstName());
            predicates.add(predicate);
        }

    }

}
