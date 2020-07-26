package com.icc.controller;

import com.icc.dto.CricketerDTO;
import com.icc.service.CricketerService;
import com.icc.vo.CricketerVO;

public final class CricketerController {
	
	private CricketerService service;

	public CricketerController(CricketerService service) {
		this.service = service;
	}
	
	public String ProcessCricketer(CricketerVO vo)throws Exception{
		CricketerDTO dto=null;
		String result=null;
		
		dto=new CricketerDTO();
		dto.setCricketerName(vo.getCricketerName());
		dto.setRunsScored(Integer.parseInt(vo.getRunsScored()));
		dto.setNoOfTimesOut(Integer.parseInt(vo.getNoOfTimesOut()));
		dto.setNoOfrunsConcedded(Integer.parseInt(vo.getNoOfrunsConcedded()));
		dto.setWicketsTaken(Integer.parseInt(vo.getWicketsTaken()));
		
		result=service.CalculateBatingAvgandBowlAvg(dto);
		return result;
		
	}

}
