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
