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
	uid 	VARCHAR(255) NOT NULL,     
	seatlocation 	VARCHAR(255) NOT NULL,
	courseid 	VARCHAR(255) REFERENCES courses(courseid),
	CONSTRAINT students_pk PRIMARY KEY(uid)
  );


INSERT INTO courses (courseid)
	VALUES('_107_1');
INSERT INTO courses (courseid)
	VALUES('_108_1');
INSERT INTO students (uid,seatlocation,courseid)
	VALUES('_10100_1','A1','_107_1');
INSERT INTO students (uid,seatlocation,courseid)
	VALUES('_10101_1','B1','_107_1');
