package com.deccan.services;

import java.util.List;

import com.deccan.exception.BatchException;
import com.deccan.model.Batch;

public class BatchService implements IBatchService{
	private String generateBatchId() {
		return "DB"+Math.round(Math.random()*99999);
	}

	@Override
	public List<Batch> displayBatches() throws BatchException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batch addBatch(Batch batch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batch updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBatch(String batchId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
