package com.TaskManagerBackend.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(
	name="practise_task",
	schema="practise"
)
public class Task{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="title", nullable=false, length=100)
	private String title;

	@Column(name="description", nullable=true, length=250)
	private String description;

	@Column(name="is_active")
	private boolean isActive = true;

	@CreationTimestamp
	@Column(nullable=false,updatable=false)
	private LocalDateTime dateCreated;

	@UpdateTimestamp
	@Column(nullable=false)
	private LocalDateTime lastUpdated;
}