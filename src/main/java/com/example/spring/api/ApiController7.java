package com.example.spring.api;

import com.example.spring.dto.a6.Customer;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/main7")
public class ApiController7 {

    @GetMapping("sub1")
    public String sub1() {
        return "sub1";
    }

    @GetMapping("sub3")
    public ResponseEntity sub3() {
        ResponseEntity response
                = new ResponseEntity(HttpStatusCode.valueOf(200));
        return response;
    }

    @GetMapping("sub4")
    public ResponseEntity sub4() {
        ResponseEntity response
                = new ResponseEntity(HttpStatusCode.valueOf(404));
        return response;
    }

    @GetMapping("sub5")
    public ResponseEntity sub5() {
        ResponseEntity response
                = new ResponseEntity(HttpStatusCode.valueOf(500));
        return response;
    }

    @GetMapping("sub6")
    public ResponseEntity sub6() {
        ResponseEntity response
                = ResponseEntity.ok().build();
        return response;
    }

    @GetMapping("sub7")
    public ResponseEntity sub7() {
        ResponseEntity response
                = ResponseEntity.notFound().build();
        return response;
    }

    @GetMapping("sub8")
    public ResponseEntity sub8() {
        ResponseEntity response
                = ResponseEntity.noContent().build();
        return response;
    }

    @GetMapping("sub9")
    public ResponseEntity sub9() {
        ResponseEntity response
                = ResponseEntity.status(405).build();
        return response;
    }

    @GetMapping("sub10")
    public ResponseEntity sub10() {
        ResponseEntity response
                = ResponseEntity.status(202).build();
        return response;
    }

    @GetMapping("sub11")
    public ResponseEntity sub11() {
        ResponseEntity response
                = ResponseEntity.status(403).build();
        return response;
    }

    @GetMapping("sub12")
    public ResponseEntity<Map<String, Object>> sub12() {
        ResponseEntity response
                = ResponseEntity.status(405)
                .body(Map.of("name", "son", "age", 30));
        return response;
    }

    @GetMapping("sub13")
    public ResponseEntity<Object> sub13() {
        boolean good = true;
        if (good) {
            ResponseEntity response
                    = ResponseEntity.ok()
                    .body(new Customer());
            return response;
        } else {
            ResponseEntity response
                    = ResponseEntity.status(404)
                    .body(Map.of("name", "son", "age", 30));
            return response;
        }
    }
}