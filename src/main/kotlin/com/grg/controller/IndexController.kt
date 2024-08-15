package com.grg.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @RequestMapping("", "/", "/index")
    fun index() = "Hello World"
}