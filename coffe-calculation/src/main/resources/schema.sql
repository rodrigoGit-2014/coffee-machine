create table dispenser
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

create table supply{
   id_dispenser integer not null,
   id_ingredient integer not null,
   quantity integer not null,
   primary key (id_dispenser,id_ingredient)
};

create table ingredient {
    id integer not null,
    name varchar(255) not null,
    primary key(id)
};

create table product {
  id integer not null,
  name varchar(255) not null,
  primary key(id)
};

create table recipe{
 id_product integer not null,
 id_ingredient integer not null,
 name varchar(255) not null,
 quantity integer,
 primary key (id_product,id_ingredient )
};

