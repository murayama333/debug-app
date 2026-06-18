package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Message;

public interface MessageMapper {

	@Select("SELECT * FROM message ORDER BY created_at DESC")
	List<Message> findAll();

	@Insert("INSERT INTO message (content) VALUES (#{content})")
	void insert(Message message);
}
