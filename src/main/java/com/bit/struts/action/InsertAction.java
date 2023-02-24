package com.bit.struts.action;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bit.struts.model.DeptDao;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Validateable;

public class InsertAction extends ActionSupport implements Validateable{
	private String title="수정";
	private int deptno;
	private String dname,loc;
	//private String errDname;
	
//	public String getErrDname() {
//		return errDname;
//	}
	public String getTitle() {
		return title;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	
	@Override
	public void validate() {
		if(deptno==0) {
			addFieldError("deptno", "빈칸입력");
		}
		if(dname.isEmpty()) {
			addFieldError("dname", "빈칸입력");
		}
//		if(dname.length()>4) {
//			addFieldError("dname", "4글자 이하 입력");
//		}
		if(dname.trim().isEmpty()) {
			addFieldError("dname", "띄어쓰기만 입력");
		}
		if(loc.isEmpty()) {
			addFieldError("loc", "빈칸입력");
		}
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("call execute");
//		if(dname.isEmpty()) {
////			errDname="빈칸입력";
//			errs.put("dname","빈칸입력");
//			return Action.INPUT;
//		}
		
		if(hasErrors()) return Action.INPUT;
		
		new DeptDao().insertOne(deptno,dname,loc);
		System.out.println(deptno+dname+loc);
		return Action.SUCCESS;
	}
	

}
