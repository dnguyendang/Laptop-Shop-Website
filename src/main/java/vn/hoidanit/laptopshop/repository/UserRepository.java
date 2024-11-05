package vn.hoidanit.laptopshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User dung);

    List<User> findByEmail(String email);

    User findById(long id);
}
