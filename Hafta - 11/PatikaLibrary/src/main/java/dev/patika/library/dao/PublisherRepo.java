package dev.patika.library.dao;

import dev.patika.library.entitites.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher,Integer> {
}
