create table emp_Department (
	uuid_ VARCHAR(75) null,
	departmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deptName VARCHAR(75) null
);

create table emp_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	jobTitle VARCHAR(1024) null,
	phoneNo LONG,
	salary LONG,
	projectId LONG,
	departmentId LONG
);

create table emp_Project (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null
);

create table office_Department (
	uuid_ VARCHAR(75) null,
	departmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deptName VARCHAR(75) null
);

create table office_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	jobTitle VARCHAR(1024) null,
	phoneNo LONG,
	salary LONG,
	deptId LONG,
	projectId LONG,
	departmentId LONG
);

create table office_Project (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null
);

create table offices_Department (
	uuid_ VARCHAR(75) null,
	departmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deptName VARCHAR(75) null
);

create table offices_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	jobTitle VARCHAR(1024) null,
	phoneNo LONG,
	salary LONG,
	projectId LONG,
	departmentId LONG
);

create table offices_Project (
	uuid_ VARCHAR(75) null,
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null
);