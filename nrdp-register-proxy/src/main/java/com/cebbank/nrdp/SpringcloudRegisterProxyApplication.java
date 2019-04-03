package com.cebbank.nrdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcloudRegisterProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRegisterProxyApplication.class,args);

        //@PostConstruct:修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器调用一次，类似于Serclet的inti()方法。被@PostConstruct修饰的方法会在构造函数之后，init()方法之前运行。
        //@Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器(应用上下文)。
        //@Import:引入带有@Configuration的java类。
        //@ImportResource:引入spring配置文件.xml。
        //@ConfigurationProperties:配置信息自动封装成实体类。
        // 1、作用在类上，例如:@ConfigurationProperties(prefix="connection")指定前缀；
        // 2、还可以直接定义在@bean的注解上，这时bean实体类就不用@Component和@ConfigurationProperties了
        //@EnableConfigurationProperties:通过该注解来明确指定需要用哪个实体类来装载配置信息。注:如果发现@ConfigurationPropertie不生效，有可能是项目的目录结构问题。
        //@Condition(WindowCondition.class):WindowCondition类实现了Condition，里面有一个方法matches，只有这个方法返回true时，才初始化，该注解修饰的类。
        //@ConditionalOnClass(java.util.HashMap.class):仅当类java.util.HashMap存在于classpath上时才创建一个bean。
        //@ConditionalOnMissingBean:作用在@bean定义上，它的作用就是在容器加载它作用的bean时，检查容器中是否存在目标类型（ConditionalOnMissingBean注解的value值）的bean了，如果存在这跳过原始bean的BeanDefinition加载动作。
        //@RequestLine:注解声明请求方法和请求地址,可以允许有查询参数

        //Environment类:环境,本身是一个PropertyResolver,即配置参数列表,更形象的说的话,就类似properties或map
        //PropertyResolver：属性解析器，用于解析相应key的value
    }
}
