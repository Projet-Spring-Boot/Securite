package com.techprimers.cache.springredisexample;

import com.techprimers.cache.springredisexample.model.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SpringRedisExampleApplication {

	@Value("${ServerPassword}")
	private String serverPassword;
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConnection = new JedisConnectionFactory();
		jedisConnection.setPassword(serverPassword);
		return jedisConnection;
	}

	@Bean
	RedisTemplate<String, User> redisTemplate() {
		RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(jedisConnectionFactory());
		return redisTemplate;
 	}


	public static void main(String[] args) {
		SpringApplication.run(SpringRedisExampleApplication.class, args);
	}
}
