package dev.donggyun

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.nio.file.Paths

internal class MainTest{
    @Test
    fun PathsTest(){
        val get = Paths.get("http://test.com/v1").resolve("/www")

    }
}