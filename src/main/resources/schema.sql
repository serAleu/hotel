create table universe_app_requests (
  id int not null auto_increment,
  added_at timestamp default current_timestamp(),
  name varchar(100) not null,
  request_type varchar(100) not null,
  primary key (id)
);

create table users (
  id int not null auto_increment,
  name varchar(100) not null,
  status int not null,
  last_universe_app_requests_id int not null,
  primary key (id)
);

create table dictionary (
  id int not null auto_increment,
  property_name varchar(100) not null,
  property_value varchar(100) not null,
  primary key (id)
);