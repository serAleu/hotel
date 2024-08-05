create table universe_app_requests (
  id int not null auto_increment,
  added_at timestamp,
  name varchar(100) not null,
  target_in_universe varchar(100) not null,
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
  added_at timestamp default current_timestamp(),
  primary key (id)
);