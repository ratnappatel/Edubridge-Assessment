create table class
(
	enrollmentNo int,
    name varchar(30),
    section char(1),
    subjectId int,
    marks int
);

insert into class values(1,"Tim","A",1,70);
insert into class values(2,"Jim","A",2,75);
insert into class values(3,"Kim","B",3,65);
insert into class values(4,"Tom","B",4,77);
insert into class values(5,"John","C",5,60);
insert into class values(6,"Joe","C",1,82);
insert into class values(7,"James","B",2,76);
insert into class values(8,"Henry","C",5,68);
insert into class values(9,"Matt","B",3,71);
insert into class values(10,"Paul","A",4,79);

select * from class;

---  Final Query

select section, count(enrollmentNo) as 'No. of Candidate greater than or equal to 75 marks'
from class
where marks>=75
group by section;
