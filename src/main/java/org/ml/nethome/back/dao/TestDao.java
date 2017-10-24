package org.ml.nethome.back.dao;

import org.apache.ibatis.annotations.Param;
import org.ml.nethome.back.domain.MyTest;

public interface TestDao {
	public MyTest queryMyTest();
	public int insertMyTest(@Param(value="test")MyTest myTest);

}
