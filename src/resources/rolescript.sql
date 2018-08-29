drop table if exists userrole.user;
drop table if exists userrole.contact;
drop table if exists userrole.role;
create table userrole.role(
  id int not null auto_increment,
  name varchar(30) not null,
  primary key(id));

create table userrole.contact(
  id int not null auto_increment,
  street varchar(30) not null,
  city varchar(30) not null,
  state varchar(30) not null,
  primary key(id));


create table userrole.user(
  id int not null auto_increment,
  name varchar(30) not null,
  contact_id int not null,
  role_id int not null,
  primary key(id),
  foreign key(contact_id)
  references contact(id),
  foreign key(role_id)
  references role(id));


insert into userrole.role (name) values ('Managing Director');
insert into userrole.role (name) values ('Manager');
insert into userrole.role (name) values ('Accountant');
insert into userrole.role (name) values ('Receptionist');

insert into userrole.contact (street,city,state) values ('10/a Eatteri Road','Salem','TamilNadu');
insert into userrole.contact (street,city,state) values ('43/d warren road','Chennai','TamilNadu');
insert into userrole.contact (street,city,state) values ('9/5A Hosur Road','Bangalore','Karnataka');
insert into userrole.contact (street,city,state) values ('GC Road','Belgaum','Karnataka');
insert into userrole.contact (street,city,state) values ('Hosa Road','Ankola','Karnataka');
insert into userrole.contact (street,city,state) values ('RSP Road','Salem','TamilNadu');

insert into userrole.user (name,role_id,contact_id) values ('Mathew',1,1);
insert into userrole.user (name,role_id,contact_id) values ('Jane',2,3);
insert into userrole.user (name,role_id,contact_id) values ('Jennifer',2,2);
insert into userrole.user (name,role_id,contact_id) values ('Bula',3,4);
insert into userrole.user (name,role_id,contact_id) values ('Rehaana',4,5);
insert into userrole.user (name,role_id,contact_id) values ('Sinjana',3,6);