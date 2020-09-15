package dev.donggyun.dto

import java.time.LocalDateTime
import java.time.LocalDateTime.now

data class Auth(
    val accessor: String,
    val client_token: String,
    val entity_id: String,
    val lease_duration: Int,
    val metadata: Metadata,
    val orphan: Boolean,
    val policies: List<String>,
    val renewable: Boolean,
    val token_policies: List<String>,
    val token_type: String
){
    val createdAt:LocalDateTime = now()
}