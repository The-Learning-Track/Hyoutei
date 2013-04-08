-- Drop all the tables if they exist
DROP TABLE IF EXISTS students CASCADE;
DROP TABLE IF EXISTS courses CASCADE;

CREATE TABLE students
  ( 
	username 	VARCHAR(255) NOT NULL,     
	seatlocation 	VARCHAR(255) NOT NULL,
	courseid 	VARCHAR(255) NOT NULL,
	UNIQUE(courseid, seatlocation),
	CONSTRAINT students_pk PRIMARY KEY(username,courseid)
  );


INSERT INTO students (username,seatlocation,courseid)
	VALUES('test01','A1','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test02','A2','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test03','A3','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test04','A4','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test05','A5','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test06','A6','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test07','A7','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test08','A8','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test09','A9','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test10','A10','_107_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test11','A11','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test12','A12','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test13','A13','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test14','A14','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test15','A15','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test16','A16','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test17','A17','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test18','A18','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test19','A19','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test20','A20','_107_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test21','A21','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test22','A22','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test23','A23','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test24','A24','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test25','A25','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test26','A26','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test27','A27','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test28','A28','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test29','A29','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test30','A30','_107_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test01','A1','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test02','A2','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test03','A3','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test04','A4','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test05','A5','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test06','A6','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test07','A7','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test08','A8','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test09','A9','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test10','A10','_108_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test11','A11','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test12','A12','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test13','A13','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test14','A14','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test15','A15','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test16','A16','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test17','A17','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test18','A18','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test19','A19','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test20','A20','_108_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test21','A21','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test22','A22','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test23','A23','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test24','A24','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test25','A25','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test26','A26','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test27','A27','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test28','A28','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test29','A29','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test30','A30','_108_1');
