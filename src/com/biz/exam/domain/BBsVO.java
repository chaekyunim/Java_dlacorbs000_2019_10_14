package com.biz.exam.domain;

public class BBsVO {

	public static void main(String[] args) {
	}
	    // seq를 정수형으로 선언함
		private String SEQ;
		// Date를 숫자형으로 선언함
		private int date ;
		// auth를 문자열형으로 선언하고 
		// 접근을 제한한다
		private String auth ;
		
		// subject를 문자열형으로 선언하고
		// 접근을 제한한다
		private	String subject;
		
		// text를 문자열형으로 선언한고
		// 접근을 제한한다
		private String text;
		// count를 정수형으로 선언한고
		// 접근을 제한한다
		private int count;
		
		// SEQ에 있는 값을 빼야한다
		//  리턴하라
		public String getSEQ() {
			return SEQ;
		}
		// SEQ에 있는 값을 입력해야한다
		public void setSEQ(String sEQ) {
			SEQ = sEQ;
		}
		// date 값을 빼와서 
		// 리턴하라
		public int getDate() {
			return date;
		}
		
		//date 값을 입력하고 저장하라
		public void setDate(int date) {
			this.date = date;
		}
		// auth 값을 빼내와서 
		// 리턴하라, 접근제한함
		public String getAuth() {
			return auth;
		}
		// auth 값을 입력하고 저장하라
		// 접근을 제한함
		public void setAuth(String auth) {
			this.auth = auth;
		}
		//subject을 빼내와서 
		// subject를 리턴하라
		public String getSubject() {
			return subject;
		}
		// subject 값을 입력하고
		// 저장하라 접근을 제한함
		public void setSubject(String subject) {
			this.subject = subject;
		}
		// text의 값을 빼내와서 
		// 리턴하라
		public String getText() {
			return text;
		}
		// text의 값을 입력하고 저장하라
		// 접근을 제한함
		public void setText(String text) {
			this.text = text;
		}
		// count의 값을 가져와서 
		// count의 값을 리턴한다
		public int getCount() {
			return count;
		}
		// count의 값을 입력하고 
		// 저장한다 
		public void setCount(int count) {
			this.count = count;
		}
		// BBsVO의 SEQ,DATE,AUTH,SUBJECT,TEXT,COUNT의 값을 더한다 
		// 리턴한다
		
		@Override
		public String toString() {
			return "BBsVO [SEQ=" + SEQ + ", date=" + date + ", auth=" + auth + ", subject=" + subject + ", text=" + text
					+ ", count=" + count + "]";
		}
		// ....
		public BBsVO() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
		
		

		
	
		
		
		
	}
