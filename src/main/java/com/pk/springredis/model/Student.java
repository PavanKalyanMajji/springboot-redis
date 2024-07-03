package com.pk.springredis.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.Data;

@Data
@RedisHash("Student")
public class Student {
	@Id
	@Indexed
	private int stuId;
	
	@Indexed
	private String studentName;
	
}
