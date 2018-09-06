package com.apbdo.scm.controller;

import com.apbdo.scm.model.Employee;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.mapper.reflect.BeanMapper;
import org.jdbi.v3.core.mapper.reflect.ConstructorMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class HelloWorldController {

    private final Jdbi jdbi;

    public HelloWorldController(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    @GetMapping("/hello")
    Mono<String> get() {
        List<Employee> employees = jdbi.withHandle(handle -> {
            handle.registerRowMapper(ConstructorMapper.factory(Employee.class));
            return handle.createQuery("select * from AGH_ANGAJAT")
                    .mapTo(Employee.class)
                    .list();
        });

        return Mono.just(Integer.toString(employees.size()));
    }
}
