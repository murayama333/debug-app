package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Message {
	private Integer id;
	private String content;
	private LocalDateTime createdAt;
}
