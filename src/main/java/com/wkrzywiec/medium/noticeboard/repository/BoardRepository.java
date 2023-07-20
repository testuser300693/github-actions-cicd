package com.test.medium.noticeboard.repository;

import com.test.medium.noticeboard.entity.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {
}
