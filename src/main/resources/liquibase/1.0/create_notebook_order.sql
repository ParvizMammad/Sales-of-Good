create table notebook_orders
(
    order_id                 integer generated always as identity
        constraint notebooks_orders_pk
            primary key,
    notebook_id        integer          not null,
    brand              varchar          not null,
    price              integer          not null,
    sell_date          date             not null
);
