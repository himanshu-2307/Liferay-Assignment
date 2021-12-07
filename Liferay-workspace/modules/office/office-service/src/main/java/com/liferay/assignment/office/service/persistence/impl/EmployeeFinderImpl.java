package com.liferay.assignment.office.service.persistence.impl;

import com.liferay.assignment.office.model.Employee;
import com.liferay.assignment.office.model.impl.EmployeeImpl;
import com.liferay.assignment.office.service.EmployeeLocalService;
import com.liferay.assignment.office.service.persistence.EmployeeFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = EmployeeFinder.class)
public class EmployeeFinderImpl extends EmployeeFinderBaseImpl implements
EmployeeFinder {
	
	public List<Employee> getEmployeeByGroupIdAndUserId( long userId, long groupId) {

		System.out.println("Inside custom sql");
		Session session = null;
		try {
			session = openSession();
			String sql = _customSQL.get(getClass(), "com.liferay.assignment.office.service.persistence.impl.EmployeeFinderImpl");
			System.out.println("Query==>" + sql);

			SQLQuery queryObject = session.createSQLQuery(sql);

			queryObject.setCacheable(false);
			queryObject.addEntity("Employee", EmployeeImpl.class);

			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(groupId);
			qPos.add(userId);
			

			List<Employee> emp= queryObject.list();
			return emp;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

	public List<Employee> getAllEmployeesInformation() {
		
		System.out.println("Inside custom sql");
		Session session = null;
		try {
			session = openSession();
			String sql = _customSQL.get(getClass(), "com.liferay.assignment.office.service.persistence.impl.EmployeeFinderImpl.Alldata");
			System.out.println("Query==>" + sql);

			SQLQuery queryObject = session.createSQLQuery(sql);

			queryObject.setCacheable(false);
			queryObject.addEntity("Employee", EmployeeImpl.class);

			QueryPos qPos = QueryPos.getInstance(queryObject);
			
			List<Employee> emp= queryObject.list();
			return emp;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

	//@ServiceReference(type = CustomSQL.class)
	
	@Reference
	private CustomSQL _customSQL;

	@ServiceReference(type = EmployeeLocalService.class)
	private EmployeeLocalService employeeLocalService;

}
