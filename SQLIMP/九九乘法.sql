CREATE procedure LOOP99 (@i int , @j int)
AS
BEGIN
DECLARE @x int , @y int , @str  varchar(200);
set @str = '' ;
set @x = 1 ;
set @y = 1 ;
BEGIN
	WHILE (@x <= @i )
		BEGIN
			WHILE ( @y <= @j ) -- if( @j <= @i )(大陸九九)
				BEGIN

			--	if (@j = @i+1)
			--	break; (大陸九九)

				SET @str = @str + right('0'+convert(varchar(2), @x),2) 
					+ '*'
					+ right('0'+convert(varchar(2), @y),2) 
					+ '=' 
					+ right('0'+convert(varchar(2), @x*@y),2)+' '
						set @y = @y+1;			
				END 
				PRINT @str ;
				set @str= '';
				set @x = @x +1;
				set @y = 1;
		END;
	END;

END;


EXEC LOOP99 4,9