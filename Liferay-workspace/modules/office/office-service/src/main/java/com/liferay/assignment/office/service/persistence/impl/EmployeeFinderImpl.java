package com.liferay.assignment.office.service.persistence.impl;

import com.liferay.assignment.office.model.Employee;
import com.liferay.assignment.office.model.impl.EmployeeImpl;
import com.liferay.assignment.office.service.persistence.EmployeeFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

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
			qPos.add(userId);
			qPos.add(groupId);

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


}
