package dev.donggyun.dto

import kotlinx.serialization.Serializable

@Serializable
data class LoginBody(
    val role_id:String,
    val secret_id:String
)