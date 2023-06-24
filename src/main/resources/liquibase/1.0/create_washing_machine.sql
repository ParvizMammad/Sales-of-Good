create table washing_machine
(
    id                   integer generated always as identity
        constraint washing_machine_id
            primary key,
    brand                varchar          not null,
    price                integer          not null,
    max_laundry_capacity double precision not null,
    programs_quantity    integer          not null,
    depth                double precision not null,
    motor_type           varchar          not null,
    height               double precision not null,
    wide                 double precision not null,
    color                varchar          not null,
    producer             varchar          not null
);

alter table washing_machine
    owner to postgres;

