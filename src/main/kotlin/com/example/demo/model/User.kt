package com.example.demo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    @Id
    val id: String? = null,
    val username: String,
    val email: String,
    val password: String,
    val role: String = "User",
    val balance: Double = 0.0
)