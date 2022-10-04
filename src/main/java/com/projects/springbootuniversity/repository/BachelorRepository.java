package com.projects.springbootuniversity.repository;

import com.projects.springbootuniversity.entity.Bachelor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BachelorRepository extends JpaRepository<Bachelor, Long> {
}
