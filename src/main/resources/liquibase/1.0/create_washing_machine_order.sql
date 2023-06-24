create table washing_machine_orders
(
    order_id                 integer generated always as identity
        constraint washing_machines_orders_pk
            primary key,
    washing_machine_id    integer          not null,
    brand              varchar          not null,
    price              integer          not null,
    sell_date          date             not null
);
