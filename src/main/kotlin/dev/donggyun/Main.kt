package dev.donggyun

import dev.donggyun.dto.LoginBody
import dev.donggyun.dto.SecretList
import dev.donggyun.dto.VaultToken
import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.coroutineScope
import java.nio.file.Paths
import java.time.LocalDateTime

class Main(
    val baseUrl: String = "https://kms.gabia.io:8200",
    val roleId: String,
    val secretId: String,
    val namespaces: List<String>
) {
    val client = HttpClient()
    val v1Url: String = "$baseUrl/v1"
    val secretList: MutableList<String> = mutableListOf()
    lateinit var token: VaultToken

    suspend fun getToken() = coroutineScope {
        if (!this@Main::token.isInitialized || LocalDateTime.now()
                .isAfter(token.auth.createdAt.plusSeconds((token.auth.lease_duration - 10).toLong()))
        ) {
            val response = client.post<VaultToken>("$baseUrl/v1/auth/approle/login") {
                body = LoginBody(roleId, secretId)
            }
            this@Main.token = response
        }
        this@Main.token
    }

    suspend fun getSecretList(base:String,pathList: List<String>): List<String> = coroutineScope {
        val token = getToken()
        pathList.forEach { path ->
            client.get<SecretList>("$v1Url")
        }
    }


}

suspend fun main(args: Array<String>) {


}