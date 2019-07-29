CREATE TABLE ShowRoom (
Vechile_id  NUMBER (10),
Vechile_name VARCHAR2 (20),
Vechile_address VARCHAR2 (30),
Vechile_no NUMBER (10),
CONSTRAINT pk5 PRIMARY KEY(Vechile_id )
);
CREATE TABLE Booking (
Booking_id  NUMBER (10),
CONSTRAINT fk FOREIGN KEY(Booking_id)
REFERENCES ShowRoom(Vechile_id)
);
