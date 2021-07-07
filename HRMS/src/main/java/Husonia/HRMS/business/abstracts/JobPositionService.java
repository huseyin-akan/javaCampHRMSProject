package Husonia.HRMS.business.abstracts;

import java.util.List;

import Husonia.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
	
	void add(JobPosition jobPosition);
}
