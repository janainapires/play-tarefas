# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tarefa (
  id                            bigserial not null,
  titulo                        varchar(255),
  descricao                     varchar(255),
  completada                    boolean default false not null,
  constraint pk_tarefa primary key (id)
);


# --- !Downs

drop table if exists tarefa cascade;

