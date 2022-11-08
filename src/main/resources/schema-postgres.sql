DROP TABLE IF EXISTS account;
CREATE TABLE account(username    varchar(15) not null,
     password    varchar(20) not null,
     email        varchar(20) not null,
     firstName    varchar(10) not null,
     lastName     varchar(10) not null,
     id           serial PRIMARY KEY);