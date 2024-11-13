package com.example.spring.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

@RestController
@RequestMapping("/api/main8")
public class ApiController8 {

    @PostMapping("sub1")
    public void method1(@RequestParam String city,
                        @RequestParam String country,

                        // 업로드되는 파일
                        @RequestParam MultipartFile file) {
        System.out.println("city = " + city);
        System.out.println("country = " + country);
        // 파일 이름
        System.out.println("file.getOriginalFilename() = " + file.getOriginalFilename());
        // 파일 크기 (byte)
        System.out.println("file.getSize() = " + file.getSize());

        // 파일 저장
        try {
            InputStream is = file.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            String outputFilePath = "C:/Temp/" + file.getOriginalFilename();
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try (bis; bos; fos; is) {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, length);
                }
                bos.flush();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
