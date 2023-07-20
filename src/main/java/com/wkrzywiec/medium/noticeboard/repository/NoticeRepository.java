package com.test.medium.noticeboard.repository;

import com.test.medium.noticeboard.entity.Notice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
}
