package com.codeup.demoblog.daos;

import com.codeup.demoblog.models.AdCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdCategoryRepository extends JpaRepository <AdCategory, Long> {
}
