package com.biz.exam.exec;


import java.util.ArrayList;
import java.util.List;

import com.biz.exam.domain.BBsVO;

public class BBsEx_01 {
	
	public static void main(String[] args) {
	}	 
	 
	//.....
    List<BBsVO> bbsVOList =
    // BBsvo를 초기화시킨다 		
	BBsVO bbsVO = new BBsVO();
    // bbsVO에 순번을 가져와라
	bbsVO.getS_seq("001");
	// bbsVO에 작성일자 20191001을 가져오라 
	bbsVO.getI_date("20191001");
	// bbsVO에 작성자을 가져오라
	bbsVO.getS_auth("홍길동");
	// bbsVO에 제목을 가져오라
	bbsVO.getS_subject("게시판시작");
	// bbsVO에 내용을 가져오라
	bbsVO.getS_text("오늘은 게시판 작성하는날");
	// bbsVO에 조회수를 가져와라 
	bbsVO.getI_count("1")
	
	//....
	BBsVO bbsVO1 = new BBsVO();
	//bbsVO에 순번을 가져와라
	bbsVO.getS_seq("002");
	// bbsVO에 작성일자를 가져와라
	bbsVO.getI_date("20191002");
	// bbsVO에 작성자를 가져와라
	bbsVO.getS_auth("이몽룡");
	// bbsVO에 제목을 가져와라
	bbsVO.getS_subject("반가워");
	// bbsVO에 내용을 가져와라
	bbsVO.getS_text("모든 사람들에게 행복 가득하세요");
	// bbsVO에 조회수를 가져와라
	bbsVO.getI_count("5")
	
	
	// bbsVo.toString 을 출력하라
	System.out.println(bbsVO.toString());
	//bbsVO에 있는 리스트를 초기화한다
	List<BBsVO> stdList = new ArrayList<BBsVO>();
	stdList.add(StudentVO.builder().s_num("001").build());
	stdList.add(StudentVO.builder().s_num("001").build());
	stdList.add(StudentVO.builder().s_num("001").build());
	stdList.add(StudentVO.builder().s_num("001").build());
			   
	 
	
		
	

}
}
