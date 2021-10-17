package com.bhbfc.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhbfc.question.model.Option;

public interface OptionsRepository extends JpaRepository<Option, Long>{

}
