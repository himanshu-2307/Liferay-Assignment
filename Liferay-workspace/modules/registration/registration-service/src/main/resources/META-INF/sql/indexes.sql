create index IX_31717400 on RGS_Register (groupId);
create index IX_4249635E on RGS_Register (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7AEF2960 on RGS_Register (uuid_[$COLUMN_LENGTH:75$], groupId);