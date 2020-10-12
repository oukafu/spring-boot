package com.fuwh.springbootfuwh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * @RestController:等于下面几个注解的组合：
 * -@Controller：指明这是一个控制器
 * -@ResponseBody：指明方法的返回值应该直接作为response的body，否则的话会去做视图解析。
 */
@SpringBootApplication
/**
 * SpringBootApplication:等于下面三个注解的组合
 * -@SpringBootConfiguration:指明这是SpringBoot的一个配置类（@Configuration）
 * -@EnableAutoConfiguration:启用自动注解，尝试根据classpath来猜测需要初始化的bean。
 * -@ComponentScan:等于context:component-scan标签，指定需要被Spring容器初始化的bean根目录，
 *                 可以通过value来指定，如果没有指定，则当前添加@ComponentScan注解的类路径为根路径。
 */
public class SpringBootFuwhApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFuwhApplication.class, args);
	}

	@RequestMapping("/home")
	public String home(){
		return "Hello World!!!";
	}
}
