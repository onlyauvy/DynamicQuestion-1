package com.bhbfc.question.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="nodes")
public class Node {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="qnName")
	private String qnName;
	
	@Column(name="question")
	private String question;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "node")
	private Set<Option> Options = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQnName() {
		return qnName;
	}

	public void setQnName(String qnName) {
		this.qnName = qnName;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<Option> getOptions() {
		return Options;
	}

	public void setOptions(Set<Option> options) {
		Options = options;
	}
	
	
}
