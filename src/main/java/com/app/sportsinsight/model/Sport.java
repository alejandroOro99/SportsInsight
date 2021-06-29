package com.app.sportsinsight.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Sport {

	@Id
	@GeneratedValue
	private int id;
}
