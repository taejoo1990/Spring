package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"kr.co.softsoldesk.beans","kr.co.softsoldesk.advisor"})
@EnableAspectJAutoProxy
public class BeanConfigClass {

}
