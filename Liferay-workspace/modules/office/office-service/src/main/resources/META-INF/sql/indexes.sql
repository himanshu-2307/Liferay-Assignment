create index IX_76810103 on emp_Department (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_534BEC45 on emp_Department (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A1941F28 on emp_Employee (name[$COLUMN_LENGTH:75$], salary);
create index IX_9848901F on emp_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_68A49261 on emp_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7193D5BC on emp_Project (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_844E9B3E on emp_Project (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_77D18C8F on office_Department (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B221EAD1 on office_Department (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_F71E8EAB on office_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9DC0C3ED on office_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_DFFDD5B0 on office_Project (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F1600832 on office_Project (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_A6022DE5 on offices_Department (deptName[$COLUMN_LENGTH:75$], departmentId);
create index IX_2DDBA2B4 on offices_Department (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F7954636 on offices_Department (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_DF9F3D0E on offices_Employee (groupId);
create index IX_93321999 on offices_Employee (name[$COLUMN_LENGTH:75$], salary);
create index IX_3C91EA10 on offices_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6AADB492 on offices_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B0AEF9AB on offices_Project (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C66FEEED on offices_Project (uuid_[$COLUMN_LENGTH:75$], groupId);