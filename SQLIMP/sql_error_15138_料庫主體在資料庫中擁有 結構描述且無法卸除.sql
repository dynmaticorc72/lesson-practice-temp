/* [Database][SQL Server] 資料庫主體在資料庫中擁有 結構描述 
   且無法卸除 Microsoft SQL Server, 錯誤: 15138
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
