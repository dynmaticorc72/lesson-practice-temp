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
			WHILE ( @y <= @j ) -- if( @j <= @i )(�j���E�E)
				BEGIN

			--	if (@j = @i+1)
			--	break; (�j���E�E)

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