package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient     // Eureka Client 标识
@SpringBootApplication  // Spring Boot 应用标识
@MapperScan("cn.dao") //mapper 接口类扫描包配置
public class PayProviderServiceApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(PayProviderServiceApp.class, args);
    }
}
