package ch07_oop;

import java.sql.Date;

/*
회사가 고용하는 여러 유형의 직원들을 나타내고자 한다.
직원은 정규직원과 비정규직원으로 나뉜다.
비정규직원은 임시직원과 인턴사원으로 나뉜다.
 
모든 직원은
 직원구분(String egroup),이름(name), 주소(address) 와소속부서(dept) 를 가지고 있다.
egroup : 정규직원, 임시 직원, 인턴사원으로 분류한다 
추가적으로 정규직원은 직원번호(empno) ,직급(position) ,연봉(sal) 과 보너스지급율(bonus : %) 을 가지고 있다.
비정규직원은 계약만료일(Date expire) 과 기본 임금(basepay)을 가지고있다.
임시 직원은 시간당 임금(hourpay)과 근무 시간(worktime)을 가지고 있고 
인턴사원은 임금지급률(int pro: %)  가지고 있다.
 
직원은 Employee 클래스로
정규직원은 formalEmployee 클래스로
비정규직원은 InformalEmployee 클래스로
임시직원은 TempEmployee클래스로
인턴사원은 InternEmployee 클래스로 한다.
 */
class Employee {
	String egroup,name,address,dept;
      Employee(String egroup) {
    	  this.egroup=egroup;
      }
   }
class formalEmployee extends Employee {
	formalEmployee(String egroup) {
		super("정규직원");

	}
	String empno;
	String position;
	int sal;
	double bonus;
}
class InformalEmployee extends Employee {
	InformalEmployee(String egroup) {
		super(egroup);
	}
	Date expire;
	int basepay;
}
class TempEmployee extends InformalEmployee {

	TempEmployee() {
		super("임시직원");
	}
int hourpay;
int workTime;
}
class InternEmployee extends InformalEmployee {
	InternEmployee() {
		super("인턴사원");
	}
	double pro;
}







