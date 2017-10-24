package org.ml.nethome.back.service;

import org.ml.nethome.back.dao.TestDao;
import org.ml.nethome.back.domain.MyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private TestDao test; 
	public MyTest searchTest(){
		return test.queryMyTest();
	}
	public boolean saveTest(MyTest myTest){
		int in = test.insertMyTest(myTest);
		if (in > 0) return true;
		return false;
	}

}
