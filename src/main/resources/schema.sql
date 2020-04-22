drop table user if exists;
create table user(
	id  bigint(5) primary key AUTO_INCREMENT,
	name  varchar(30),
	sex  varchar(12)
);
