package com.example.hhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * RestController注解是controller和ResponseBody的组合，返回字符串或json数据,小心使用
 * GetMapping相当RequestMapping和get请求组合method = RequestMethod.GET
 * PostMapping和上面类似
 * PutMapping是和put请求组合，put是修改方法，可以用postMapping代替，用的较少
 * DeleteMapping是和delete方法组合，可以用get方法代替，用的较少
 */
@EnableTransactionManagement
@SpringBootApplication
public class WmsApplication {
    //启动springboot程序 启动spring容器 启动tomcat
    public static void main(String[] args) {
        SpringApplication.run(WmsApplication.class, args);
    }

}
