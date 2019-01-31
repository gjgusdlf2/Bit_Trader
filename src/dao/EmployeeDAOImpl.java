package dao;

import java.util.List;

import domain.EmployeeDTO;
import enums.EmployeeSQL;
import enums.Vender;
import factory.DatabaseFactory;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {}
	public static EmployeeDAOImpl getInstance() {
		return instance;
	}
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		try {
		int rs = 
				DatabaseFactory.createDatabase(Vender.ORACLE).getConnect().prepareStatement(EmployeeSQL.REGISTER.toString()).executeUpdate();
		System.out.println((rs==1) ? "입력성공" : "입력 실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
