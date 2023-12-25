package com.ms.sharedentityv1.jpaRepo;

import com.ms.sharedentityv1.domains.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String email);

//	void deleteByEmail(String email);

	Optional<User> findByUsernameAndEnabledTrue(String username);

	boolean existsByUsernameAndEnabledTrue(String username);

	Optional<User> findByIdAndEnabledTrue(Long valueOf);

	List<User> findByEnabledTrue(Pageable pageable);

	List<User> findByRoleRoleIdNotInAndEnabledTrue(Set<Integer> roles, Pageable pageable);
}