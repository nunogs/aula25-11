package com.db1start.cidadesapi.service;

import static org.junit.Assert.*;

import org.aspectj.lang.annotation.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.db1start.cidadesapi.domain.entity.Estado;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EstadoServiceTest {

	
	@Autowired
	private EstadoService estadoService;
	
	@org.junit.After
	public void clean() {
		estadoService.limpar();
	}
	
	@Test
	public void test() {
		Estado estado = estadoService.criar("Paraná");
		
		assertNotNull(estado);
		System.out.println(estado.getId());
		
		
	}

}
