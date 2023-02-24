package com.bit.struts.action;

import java.util.Arrays;
import java.util.List;

import com.bit.struts.model.DeptDao;
import com.bit.struts.model.DeptVo;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action {
	private List<DeptVo> list;
	
	
	
	public List<DeptVo> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		list=new DeptDao().findAll();
//		list=Arrays.asList(
//				new DeptVo(1111,"test1","test"),
//				new DeptVo(2222,"test1","test"),
//				new DeptVo(3333,"test1","test"),
//				new DeptVo(4444,"test1","test")
//				);
		return Action.SUCCESS;
	}

}
