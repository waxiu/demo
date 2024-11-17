package com.example.demo.controller

import com.example.demo.model.User
import com.example.demo.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userRepository: UserRepository) {

    @GetMapping("/test-mongo")
    fun testMongo(): String {
        val user = User(username = "testUser", email = "test@example.com", password = "password123")
        userRepository.save(user)
        return "MongoDB działa! Zapisano użytkownika: ${user.username}"
    }
}
