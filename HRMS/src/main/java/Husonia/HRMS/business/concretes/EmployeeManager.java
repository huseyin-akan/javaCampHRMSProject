package Husonia.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import Husonia.HRMS.business.abstracts.EmployeeService;
import Husonia.HRMS.dataAccess.abstracts.EmployeeDao;
import Husonia.HRMS.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;	
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public void add(Employee employee) {
		
		//TODO: İş kuralları
		//1. ad soyad, tc no, doğum yılı, eposta, şifre, şifre tekrarı bilgilerini iste. Boş geçilemez.
		//2. mernis doğrulaması yap.
		//3. daha önce kayıtlı bir Tc veya eposta varsa kayıt yapılamaz.
		employeeDao.save(employee);
		
	}

}
