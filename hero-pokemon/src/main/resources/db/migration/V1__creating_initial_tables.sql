create table trainers
(
    id integer
    auto_increment,
    name varchar
    (100) not null,
    level SMALLINT not null DEFAULT 1,
    PRIMARY key
    (id)
);

    create table pokemon
    (
        id INTEGER
        auto_increment,
    name varchar
        (20) not null,
    number SMALLINT not null,
    PRIMARY KEY
        (id)
);

        create table wild_pokemon
        (
            id integer
            auto_increment,
combat_power SMALLINT not null default 0,
pokemon_id integer not null,
trainer_id integer,
PRIMARY key
            (id),
FOREIGN key
            (pokemon_id) REFERENCES pokemon
            (id) on
            delete CASCADE,
FOREIGN key (trainer_id)
            REFERENCES trainers
            (id) on
            delete
            set null
            );