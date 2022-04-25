package com.jnsdev

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


/**
 * @Autor Jairo Nascimento
 * @Created 25/04/2022 - 11:47
 */
@RestController
class GreetingController {
    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
fun greeting(@RequestParam(value = "name", defaultValue = "Word") name: String?): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello, $name!")
    }
}