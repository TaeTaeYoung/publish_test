package com.bit.struts.action;

import com.bit.struts.model.DeptVo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UpdateAction implements Action,ModelDriven<DeptVo>, Preparable {

	DeptVo bean;
	
	@Override
	public void prepare() throws Exception {
		bean=new DeptVo();//요청마다 객체를 찍는다?
	}
	@Override
	public DeptVo getModel() {
		return bean;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(bean);
		return Action.SUCCESS;
	}

	

	

}
