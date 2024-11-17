package com.example.demo.controller

import org.springframework.data.redis.core.RedisTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RedisTestController(private val redisTemplate: RedisTemplate<String, Any>) {

    @GetMapping("/test-redis")
    fun testRedis(): String {
        redisTemplate.opsForValue().set("testKey", "testValue")
        val value = redisTemplate.opsForValue().get("testKey")
        return "Redis działa! Wartość: $value"
    }
}
