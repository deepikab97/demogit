package com.deccan.dao;

import java.util.List;

import com.deccan.exception.BatchException;
import com.deccan.model.Batch;

public interface IBatchDao {
	public List<Batch> displayBatches() throws BatchException;
	public Batch addBatch(Batch batch);
	public Batch updateBatch(Batch batch);
	public void removeBatch(String batchId);
}
