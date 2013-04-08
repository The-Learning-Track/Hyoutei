-- Drop all the tables if they exist
DROP TABLE IF EXISTS students CASCADE;
DROP TABLE IF EXISTS courses CASCADE;

-- Create Tables
CREATE TABLE courses
  ( 
	courseid 	VARCHAR(255) NOT NULL,
	CONSTRAINT courses_pk PRIMARY KEY(courseid)
  );

CREATE TABLE students
  ( 
	username 	VARCHAR(255) NOT NULL,     
	seatlocation 	VARCHAR(255) NOT NULL,
	courseid 	VARCHAR(255) REFERENCES courses(courseid),
	UNIQUE(courseid, seatlocation),
	CONSTRAINT students_pk PRIMARY KEY(username,courseid)
  );


INSERT INTO courses (courseid)
	VALUES('1');
INSERT INTO courses (courseid)
	VALUES('2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test01','A1','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test02','A2','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test03','A3','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test04','A4','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test05','A5','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test06','A6','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test07','A7','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test08','A8','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test09','A9','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test10','A10','1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test11','A11','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test12','A12','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test13','A13','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test14','A14','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test15','A15','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test16','A16','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test17','A17','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test18','A18','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test19','A19','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test20','A20','1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test21','A21','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test22','A22','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test23','A23','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test24','A24','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test25','A25','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test26','A26','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test27','A27','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test28','A28','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test29','A29','1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test30','A30','1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test01','A1','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test02','A2','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test03','A3','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test04','A4','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test05','A5','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test06','A6','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test07','A7','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test08','A8','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test09','A9','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test10','A10','2');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test11','A11','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test12','A12','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test13','A13','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test14','A14','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test15','A15','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test16','A16','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test17','A17','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test18','A18','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test19','A19','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test20','A20','2');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test21','A21','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test22','A22','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test23','A23','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test24','A24','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test25','A25','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test26','A26','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test27','A27','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test28','A28','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test29','A29','2');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('test30','A30','2');
