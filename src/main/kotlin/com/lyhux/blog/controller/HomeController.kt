package com.lyhux.blog.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping



@Controller
class HomeController {

    @GetMapping("/")
    fun home(model: Model,
             @RequestParam(value = "name", required = false, defaultValue = "Guest")
             name: String): String {

        model.addAttribute("title", appName)
        return "home"

    }

    companion object {
        private val appName = "ThymeleafTour"
    }
}