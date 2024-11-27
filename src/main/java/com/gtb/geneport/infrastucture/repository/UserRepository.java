package com.gtb.geneport.infrastucture.repository;

import com.gtb.geneport.infrastucture.presentation.UserPresentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserPresentation, Long> {
}
