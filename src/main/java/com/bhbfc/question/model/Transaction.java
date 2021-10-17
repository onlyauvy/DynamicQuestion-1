package com.bhbfc.question.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="sourceNode")
	private long sourceNode;
	
	@Column(name="optionId")
	private long optionId;
	
	@Column(name="destinationNode")
	private long destinationNode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSourceNode() {
		return sourceNode;
	}

	public void setSourceNode(long sourceNode) {
		this.sourceNode = sourceNode;
	}

	public long getOptionId() {
		return optionId;
	}

	public void setOptionId(long optionId) {
		this.optionId = optionId;
	}

	public long getDestinationNode() {
		return destinationNode;
	}

	public void setDestinationNode(long destinationNode) {
		this.destinationNode = destinationNode;
	}
	
	
}
