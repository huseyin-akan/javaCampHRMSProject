package Husonia.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Husonia.HRMS.business.abstracts.JobPositionService;
import Husonia.HRMS.dataAccess.abstracts.JobPositionDao;
import Husonia.HRMS.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

	@Override
	public void add(JobPosition jobPosition) {

		this.jobPositionDao.save(jobPosition);
		
	}
}
