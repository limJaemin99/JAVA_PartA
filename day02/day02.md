# day02

## A03DataTest
### A04DataExam
	- 초기값을 저장하여 변수 선언
	- 실수와 정수의 곱셈
	- 정수 형식으로 강제 캐스팅
#### A05VariableExam
	- 초기값 없이 변수 선언
	- 2개의 정수 나눗셈
	- 실수 형식 결과값을 위한 강제 캐스팅
	
##### 요약
	1. 데이터의 형식과 크기
	    			▶ 기본형								▶ 참조형
	    			
            정수		byte	1byte				 문자열	 String	 ???
            		short	2byte
            		int		4byte
            		long	8byte
            		
            실수		float	4byte
            		double	8byte
            		
            문자형	char	2byte
            
            논리형	boolean	1byte
        
       정수 8byte long 과 실수 8byte double은 메모리 크기는 같지만 표현 형식이 다르다.
       double 형식이 훨씬 매우 큰 범위의 값을 표현한다.

	2. 캐스팅 (형변환) : 데이터 형식 변환을 말한다.
      ▶ 자동 캐스팅 (자동으로 데이터 형식이 변환된다)
      	ex) int 값을 double 변수로 저장할 때 >> double weight = 57;			(O)
      		반대로 double 값을 int 변수로 저장하는 것은 오류 >> int age = 34.2;	(X)
      
      ▶ 강제 캐스팅 (직접적인 명령으로 데이터 형식이 변환된다)
      	ex) int age = 34.2; 와 같은 데이터 변환을 강제로 한다. 이런 경우 데이터가 손실될 수 있다.
      	






