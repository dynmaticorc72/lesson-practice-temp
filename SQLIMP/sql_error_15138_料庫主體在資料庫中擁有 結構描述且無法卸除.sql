/* [Database][SQL Server] ��Ʈw�D��b��Ʈw���֦� ���c�y�z 
   �B�L�k���� Microsoft SQL Server, ���~: 15138
*/
--http://dog0416.blogspot.tw/2015/04/databasemssql-microsoft-sql-server-15138.html

select * from sys.schemas
select * from sysusers


SELECT * FROM INFORMATION_SCHEMA.SCHEMATA
ALTER AUTHORIZATION ON SCHEMA::db_owner TO [dbo]

use northwind
go
DROP USER u1
GO
