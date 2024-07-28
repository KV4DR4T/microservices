CREATE  TABLE "client"
(
    "id"            bigint   NOT NULL,
    "full_name"     varchar(128) NOT NULL,
    "address"       varchar(255) NOT NULL,
    "card_number"   varchar(20) NOT NULL,

    PRIMARY KEY ("id")
);