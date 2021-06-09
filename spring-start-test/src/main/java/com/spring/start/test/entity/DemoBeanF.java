package com.spring.start.test.entity;

import com.spring.start.test.service.DemoBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Autowired 的注入形式
 *
 * 默认 required = true，当注入属性查找不到对应实例 bean，会抛异常
 */
@Component
public class DemoBeanF implements DemoBeanService {

    private final DemoBeanC demoBeanC;
    private final DemoBeanD demoBeanD;

	/**
	 * 官方建议是对于必要的参数使用构造器注入，由于 final 关键字修饰及构造器参数优势，
	 * 在构造此实例时，会确保构造参数已经存在实例，此时 final 参数的值不会为 null。
	 */
	@Autowired
    public DemoBeanF(DemoBeanC demoBeanC, DemoBeanD demoBeanD) {
        this.demoBeanC = demoBeanC;
        this.demoBeanD = demoBeanD;
    }

    public DemoBeanC getDemoBeanC() {
        return demoBeanC;
    }

    public DemoBeanD getDemoBeanD() {
        return demoBeanD;
    }

	@Override
	public void getMethod() {
		System.out.println("实现的接口方法！");
	}
}
