package com.codeup.demoblog.daos;

import com.codeup.demoblog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository <Ad, Long>{

Ad findByTitle(String title);

Ad findByTitleLike(String searchPatt);

}
