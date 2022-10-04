package com.projects.springbootuniversity.repository;

import com.projects.springbootuniversity.entity.Phd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhdRepository extends JpaRepository<Phd, Long> {
}
