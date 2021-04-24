package com.learning.docker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerRepository extends JpaRepository<Docker, Integer> {
}
