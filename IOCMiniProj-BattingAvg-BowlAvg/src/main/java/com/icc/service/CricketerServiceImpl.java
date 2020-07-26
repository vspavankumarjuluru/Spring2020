package com.icc.service;

import com.icc.bo.CricketerBO;
import com.icc.dao.CricketerDAO;
import com.icc.dto.CricketerDTO;

public class CricketerServiceImpl implements CricketerService {
	private CricketerDAO dao;

	public CricketerServiceImpl(CricketerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String CalculateBatingAvgandBowlAvg(CricketerDTO dto) throws Exception {
		float battingAvg = 0.0f;
		float bowlingAvg = 0.0f;
		CricketerBO bo = null;
		int count = 0;

		battingAvg = (dto.getRunsScored() / dto.getNoOfTimesOut());
		bowlingAvg = (dto.getNoOfrunsConcedded() / dto.getWicketsTaken());

		bo = new CricketerBO();
		bo.setCricketerName(dto.getCricketerName());
		bo.setRunsScored(dto.getRunsScored());
		bo.setNoOfTimesOut(dto.getNoOfTimesOut());
		bo.setBattingAvg(battingAvg);
		bo.setNoOfrunsConcedded(dto.getNoOfrunsConcedded());
		bo.setWicketsTaken(dto.getWicketsTaken());
		bo.setBowlAvg(bowlingAvg);

		count = dao.insertCricketerDetails(bo);

		if (count == 0)
			return "Cricketer Registration failed :: Batting Avg::" + battingAvg + "   Bowling Avg::" + bowlingAvg;
		else
			return "Cricketer Registration Succeded :: Batting Avg::" + battingAvg + "  Bowling Avg::" + bowlingAvg;
	}

}
