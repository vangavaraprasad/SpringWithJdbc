package com.person.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personcontroller {
	

	private JdbcTemplate jdbctemp;
	
	@PostMapping("SavePer")
	public void saveCust(@RequestBody person per)
	{
		System.out.println(per);
		jdbctemp.update("Insert into person values(?,?,?,?)",
				per.getPid(),per.getPname(),per.getPage(),per.getPqual());
	}

}
