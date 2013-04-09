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
	VALUES('test11','B1','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test12','B2','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test13','B3','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test14','B4','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test15','B5','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test16','B6','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test17','B7','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test18','B8','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test19','B9','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test20','B10','_107_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test21','C1','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test22','C2','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test23','C3','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test24','C4','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test25','C5','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test26','C6','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test27','C7','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jntullo','C8','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('dicksonp','C9','_107_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('realpxy','C10','_107_1');

	
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
	VALUES('test11','B1','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test12','B2','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test13','B3','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test14','B4','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test15','B5','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test16','B6','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test17','B7','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test18','B8','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test19','B9','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test20','B10','_108_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test21','C1','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test22','C2','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test23','C3','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test24','C4','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test25','C5','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test26','C6','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test27','C7','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jntullo','C8','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('dicksonp','C9','_108_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('realpxy','C10','_108_1');
