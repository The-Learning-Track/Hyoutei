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
	VALUES('ajoseph','A1','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('bday','A2','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('dmoody','A3','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('drobinson','A4','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ebarnes','A5','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ethomas','A6','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('gmills','A7','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('hadkins','A8','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jsimon','A9','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jsimpson','A10','_17_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jwalters','B1','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jwood','B2','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('landerson','B3','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ldiaz','B4','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lhampton','B5','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lkennedy','B6','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lmalone','B7','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lstephens','B8','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('mfox','B9','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('mgordon','B10','_17_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('nhudson','C1','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('pblack','C2','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('rmurray','C3','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('rvega','C4','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('rwilkins','C5','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('scastro','C6','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('swise','C7','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('dicksonp','C9','_17_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('realpxy','C10','_17_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ajoseph','studioA1','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('bday','studioA2','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('dmoody','studioA3','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('drobinson','studioA4','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ebarnes','studioA5','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ethomas','studioA6','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('gmills','studioA7','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('hadkins','studioA8','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jsimon','studioA9','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jsimpson','studioD1','_18_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jwalters','studioB1','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('jwood','studioB2','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('landerson','studioB3','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('ldiaz','studioB4','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lhampton','studioB5','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lkennedy','studioB6','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lmalone','studioB7','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('lstephens','studioB8','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('mfox','studioB9','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('mgordon','studioD2','_18_1');

	
INSERT INTO students (username,seatlocation,courseid)
	VALUES('nhudson','studioC1','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('pblack','studioC2','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('rmurray','studioC3','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('rvega','studioC4','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('rwilkins','studioC5','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('scastro','studioC6','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('swise','studioC7','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('dicksonp','studioC9','_18_1');
INSERT INTO students (username,seatlocation,courseid)
	VALUES('realpxy','studioD3','_18_1');
