DECLARE
num1 int := 10;
num2 int := 50;
BEGIN
for b in num1..num2 loop
dbms_output.put_line(b);
end loop;
-- while num1 <=50 loop
-- dbms_output.put_line(num1);
-- num1 := num1+10;
-- end loop;
-- for a in reverse 10..20 loop
-- dbms_output.put_line(a);
-- end loop;
-- dbms_output.put_line('================================');
-- loop
-- dbms_output.put_line(num1);
-- num1 := num1+10;
-- if num1 > 50 then exit ;
-- end if;
-- end loop;
-- case num1
-- when 10 then dbms_output.put_line('its 10');
-- when 20 then dbms_output.put_line('its 20');
-- when 30 then dbms_output.put_line('its 30');
-- when 40 then dbms_output.put_line('its 40');
-- when 50 then dbms_output.put_line('its 50');
-- else dbms_output.put_line('nothing');
-- end case;
-- if (num1 <20) then
--   dbms_output.put_line('hello');
-- elsif num1 = 30  then
--   dbms_output.put_line('faizan');
-- else
--   dbms_output.put_line('hmmm');
-- end if;
END;
/



-- DECLARE
-- num1 int := 30;
-- num2 int := 50;
-- num3 int;
-- out1 int := 10;
-- out2 int := 20;
-- oin int := 30;
-- BEGIN
-- num3 := num1 + num2;
-- dbms_output.put_line(num3);
-- dbms_output.put_line('out 1 : '||out1);
-- dbms_output.put_line('out 2 : '||out2);
-- dbms_output.put_line('oin : '||oin);
--   DECLARE
--     in1 int := 100;
--     in2 int := 200;
--     -- oin := 300;
--   BEGIN
--     dbms_output.put_line('In 1: '|| in1);
--     dbms_output.put_line('In 2: '|| in2);
--     dbms_output.put_line('oin : '|| oin);
--   END;
-- END;
-- /