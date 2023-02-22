package cn.tedu.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author MasterZ
 * @version 1.0
 * @projectName yeb_hd
 * @package cn.tedu.server
 * @className YebApplication
 * @description cn.tedu.server的启动类
 * @date 2023/2/22 11:15
 */

@SpringBootApplication
@MapperScan("cn.tedu.server.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class,args);
    }
}
