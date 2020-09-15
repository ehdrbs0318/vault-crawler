package dev.donggyun.dto

data class VaultToken(
    val auth: Auth,
    val `data`: Any?,
    val lease_duration: Int,
    val lease_id: String,
    val renewable: Boolean,
    val request_id: String,
    val warnings: Any?,
    val wrap_info: Any?
)