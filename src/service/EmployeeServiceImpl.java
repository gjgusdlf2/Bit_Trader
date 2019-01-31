package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import domain.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService{
	private static EmployeeServiceImpl instance = new EmployeeServiceImpl();
	private EmployeeServiceImpl() {dao = EmployeeDAOImpl.getInstance();}
	public static EmployeeServiceImpl getInstance() {
		return instance;
	}
	EmployeeDAO dao;
	@Override
	public void registEmployee(EmployeeDTO emp) {
		dao.insertEmployee(emp);
		
	}
	@Override
	public List<EmployeeDTO> bringEmployeeList() {
		return dao.selectEmployeeList();
	}
	@Override
	public List<EmployeeDTO> retrieveEmployees(String searchWord) {
		return dao.selectEmployees(searchWord);
	}
	@Override
	public EmployeeDTO retrieveEmployee(String searchWord) {
		return dao.selectEmployee(searchWord);
	}
	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return dao.countEmployees();
	}
	@Override
	public boolean eistsEmployee(String searchWord) {
		return dao.existsEmployee(searchWord);
	}
	@Override
	public void modifyEmployee(EmployeeDTO emp) {
		dao.updateEmployee(emp);
	}
	@Override
	public void removeEmployee(EmployeeDTO emp) {
		dao.deleteEmployee(emp);
		
	}
	

}
