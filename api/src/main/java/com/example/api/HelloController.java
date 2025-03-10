package com.example.api;

import com.example.api.entities.GreetingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private GreetingRepository greetingRepository;

    public HelloController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @RequestMapping("/hello")
            public String hello(
                    @RequestParam String lang
    ) {
        GreetingEntity entity = greetingRepository.findFirstByLang(lang);
        return entity.text;
    }
}
