package Husonia.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import Husonia.HRMS.business.abstracts.EmployerService;
import Husonia.HRMS.dataAccess.abstracts.EmployerDao;
import Husonia.HRMS.entities.concretes.Employer;

public class EmployerManager implements EmployerService{

private EmployerDao employerDao;	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public void add(Employer employer) {
		
		//TODO : iş kuralları
		// 1. kullanıdan şirket adı, web sitesi, web sitesi email adresi, telefon no, şifre ve şifre tekrarı iste. tüm alanlar zorunlu.
		// 2. HRMS personeli onayı.
		// 3. aynı eposta adresi varsa kayıt yapılmaz.
		
		this.employerDao.save(employer);
		
	}

}
