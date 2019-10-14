package com.biz.exam.exec;

import java.util.List;

import com.biz.exam.domain.BBsVO;
import com.biz.exam.service.BBsReadService;

public class BBsEx_02 extends BBsReadService {
	
	
	//BBsReadService 상속한다
    public interface BBsReadService{
		
		//....
		public void readBBs(String bbsFile);
		
		// bbsVO List를 가져와라 
		public List <BBsVO> getBBsList();
		
	}

}
