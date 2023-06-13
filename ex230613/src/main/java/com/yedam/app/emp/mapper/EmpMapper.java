package com.yedam.app.emp.mapper;

import java.util.List;


import com.yedam.app.emp.service.EmpVO;

public interface EmpMapper {
	//전체 조회
	public List<EmpVO> selectAllEmp();
	
	//단건조회
	public EmpVO selectEmpInfo(EmpVO empVO);
	
	//둥록
	public int insertEmpinfo(EmpVO empVO);
	

}
