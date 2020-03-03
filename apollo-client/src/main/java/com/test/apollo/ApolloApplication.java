package com.test.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author Mirko
 * @Description
 * @createTime 2020年02月21日 15:26:00
 */
@SpringBootApplication
// 命名空间，默认是application
@EnableApolloConfig(value = "yz")
public class ApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloApplication.class);
    }
}
