package com.ssafy.farmily.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class CommunityPost extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition = "VARCHAR(255)")
	private String title;

	@ManyToOne
	@JoinColumn(name = "authorId")
	private Member author;

	@Column(columnDefinition = "TEXT")
	private String content;

	@ManyToOne
	@JoinColumn(name = "sprintId")
	private Sprint sprint;
}
