package com.dmas.springboot2postgresjpahibernatecrudexample.repository;


import com.dmas.springboot2postgresjpahibernatecrudexample.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

}
