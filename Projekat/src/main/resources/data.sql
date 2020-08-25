INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Inception','Izmedju snova i stvarnosti',123,'Naucna fantastika',8.7);
INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Betmen: Pocetak','Gotamski heroj',145,'Akcioni',8.7);
INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Betmen: Mracni vitez','Ili umres kao heroj ili zivis dovoljno dugo da vidis sebe kako postajes los',160,'Akcioni',9.3);
INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Betmen: Uspon mracnog viteza','Gotamu je ponovo potreban heroj ili zlikovac?',181,'Akcioni',8.7);
INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Kum 1','Prica o porodici Korleone',187,'Trilogija',10);
INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Kum - drugi deo','Nastavak price o porodici Korleone. Saznacete kako je sve pocelo',187,'Trilogija',9.2);
INSERT INTO MOVIE(name,description,duration,genre,rating) VALUES ('Dzoker','Prica o odbacenom coveku',168,'Drama',7.8);




INSERT INTO CINEMA(name,address,phone_number,email) VALUES ('Cineplex','Beograd Usce','0692313131','cineplex@gmail.com');
INSERT INTO CINEMA(name,address,phone_number,email) VALUES ('Cinestar','Novi Sad Promenada','0642151412','cinestar@gmail.com');
INSERT INTO CINEMA(name,address,phone_number,email) VALUES ('Arena','Kragujevac','0642154212','arena@gmail.com');





INSERT INTO USER(username,password,name,lastname,phone_number,email,activity,role,date) VALUES ( 'Mlaki99','123','Mladen','Pavlovic','0692049991','mlaki@gmail.com',true,2,'1999-04-04');
INSERT INTO USER(username,password,name,lastname,phone_number,email,activity,role,cinema_id,date) VALUES ( 'Rema','123','Marko','Dostanic','062332422','rema@gmail.com',true,1,1,'2000-01-01');
INSERT INTO USER(username,password,name,lastname,phone_number,email,activity,role,cinema_id,date) VALUES ( 'Vidak','123','Vidak','Sarenac','062332421','vidak@gmail.com',true,1,2,'1999-01-03');
INSERT INTO USER(username,password,name,lastname,phone_number,email,activity,role,date) VALUES ( 'Mirkec','123','Mirko','Ivanic','064324223','mirko@gmail.com',true,0,'2005-01-01');
INSERT INTO USER(username,password,name,lastname,phone_number,email,activity,role,date) VALUES ('Aleksa','123','Aleksa','Aleksic','06243224','aleksa@gmail.com',true,0,'2003-01-02');



INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (0,3,1);
INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (10,3,2);
INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (9,4,1);
INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (0,4,2);
INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (8,4,3);
INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (7,3,5);
INSERT INTO WATCHED_MOVIE(rating,user_id,movie_id) VALUES (6,4,5);




INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'Sala 1',1);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'Sala 2',1);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'Sala 3',1);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'Sala 4',1);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'Sala 5',1);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'SalaSala 1',2);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (100,'SalaSala 2',2);
INSERT INTO ROOM(capacity,mark,cinema_id) VALUES (50,'SalaSala 3',2);




INSERT INTO PROJECTION(day,time,price,cinema_id,movie_id) VALUES ('2020-06-01','19:00',450,1,3);
INSERT INTO PROJECTION(day,time,price,cinema_id,movie_id) VALUES ('2020-06-02','16:30',250,1,1);
INSERT INTO PROJECTION(day,time,price,cinema_id,movie_id) VALUES ('2020-06-01','20:00',350,2,6);
INSERT INTO PROJECTION(day,time,price,cinema_id,movie_id) VALUES ('2020-06-04','22:00',350,1,2);
INSERT INTO PROJECTION(day,time,price,cinema_id,movie_id) VALUES ('2020-06-04','14:00',450,2,5);




INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (1,1);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (2,2);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (3,3);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (4,4);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (5,5);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (1,2);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (1,3);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (1,4);
INSERT INTO ROOM_PROJECTION(room_id,projection_id) VALUES (1,5);


INSERT INTO RESERVATIONS(user_id,projection_id) VALUES (3,1);
INSERT INTO RESERVATIONS(user_id,projection_id) VALUES (4,1);

