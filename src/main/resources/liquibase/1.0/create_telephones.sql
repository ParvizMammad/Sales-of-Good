create table telephones
(
    id                 integer generated always as identity
        constraint id_pk
            primary key,
    brand              varchar          not null,
    price              integer          not null,
    screen             double precision not null,
    camera             integer          not null,
    operating_system   varchar          not null,
    sim_card           integer          not null,
    weight             double precision not null,
    producer           varchar          not null,
    color              varchar          not null
);

alter table telephones
    owner to postgres;


