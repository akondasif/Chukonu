package com.yxy.chukonu.test.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yxy.chukonu.mybatis.mapper.account.Account;
import com.yxy.chukonu.mybatis.mapper.account.AccountMapper;

public class AccountTestByMapperScanner {
	
	private AccountMapper mapper ;

	@Before
	public void createSession(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis-mapperScannerConfigurer.xml") ;
		mapper = ctx.getBean(AccountMapper.class) ;
	}
	
	@Test
	public void testQuery() {
		Account result = mapper.findAccount("aa889216-2dec-437b-87b0-1272d12a80c8") ;
		assertEquals("1000100010001000", result.getAcc_number());
	}
}
