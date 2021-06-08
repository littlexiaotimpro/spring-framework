package com.spring.start.test.config;

import com.spring.start.test.config.selector.ImportDemoSelector;
import com.spring.start.test.entity.DemoBean;
import com.spring.start.test.config.register.ImportDemoBeanDefinitionRegistrar;
import com.spring.start.test.entity.DemoBeanE;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.spring"})
@Import({ImportDemoSelector.class,ImportDemoBeanDefinitionRegistrar.class})
public class ComponentScanConfig {

    @Bean(name="demoBean",initMethod = "init",destroyMethod = "destroy")
    public DemoBean demoBean(){
        return new DemoBean();
    }

    @Bean(name="demoBean1",initMethod = "init",destroyMethod = "destroy")
    public DemoBean demoBean1(){
        return new DemoBean();
    }

    /**
     * 1.带参数的Bean注入，会自动去容器中获取参数类型对应的对象
     * 默认按类型匹配，若存在多个匹配对象，则按照参数名称匹配
     * 多实例前提下，参数名无法匹配则以类型匹配注入，此时找到多个值，属性注入失败。
     *
     * 2.Profile
     * 指定组件的加载环境：spring.profiles.active=xxx
     * 不符合条件的组件不会进行注入
     * PS:若注解修饰整个配置类，即使内部存在符合条件的组件，但整个配置类不符合条件依旧不会注入
     */
    /*@Profile("test")
    @Bean
    public DemoBeanE demoBeanE(DemoBean demoBean1){
        DemoBeanE demoBeanE = new DemoBeanE();
        demoBeanE.setDemoBean(demoBean1);
        return demoBeanE;
    }*/
}
