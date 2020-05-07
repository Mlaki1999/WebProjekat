INSERT INTO BIOSKOP (naziv, adresa, telefon, email) VALUES ('Promenada', 'Liman-Novi Sad', '022/612-383', 'Promenada@gmail.com');
INSERT INTO BIOSKOP (naziv, adresa, telefon, email) VALUES ('Cineplex', 'Centar-Novi Sad', '022/612-384', 'Cineplex@gmail.com');
INSERT INTO BIOSKOP (naziv, adresa, telefon, email) VALUES ('Cinestar', 'Grbavica-Novi Sad', '022/614-398', 'Cinestar@gmail.com');
INSERT INTO BIOSKOP (naziv, adresa, telefon, email) VALUES ('UsceCinema', 'Usce-Beograd', '023/653-345', 'Usce@gmail.com');

INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (200, 'A5', 1);
INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (250, 'B4', 1);
INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (150, 'B2', 1);
INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (250, 'A1', 2);
INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (250, 'A2', 2);
INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (100, 'B1', 3);
INSERT INTO SALA (kapacitet, oznaka_Sale, bioskop_id) VALUES (250, 'A1', 4);


INSERT INTO KORISNICI (ime, prezime, korisnicko_ime, lozinka, telefon, email,uloga,datum_rodjenja) VALUES ('Aleksandar', 'Aleksić', 'Acko', 'Balot187', '064/2049991','acko@gmail.com',1,'2000-02-10');
INSERT INTO KORISNICI (ime, prezime, korisnicko_ime,uloga) VALUES ('Mirko','Ivanic','Mirkoo',0);
INSERT INTO KORISNICI (ime, prezime, korisnicko_ime,uloga) VALUES ('Mirka','Ivanovic','Mirkec',2);
INSERT INTO KORISNICI (ime, prezime, korisnicko_ime,uloga) VALUES ('Marko','Markovic','Marko76',0);
INSERT INTO KORISNICI (ime, prezime, korisnicko_ime,uloga) VALUES ('Perica','Perovic','Pera',1);
INSERT INTO KORISNICI (ime, prezime, korisnicko_ime,uloga) VALUES ('Katarina','Katic','Katarinicaa',2);


INSERT INTO FILM (naziv, zanr) VALUES ('Slendermen', 'horor');
INSERT INTO FILM (naziv, zanr) VALUES ('Marli i ja', 'komedija');
INSERT INTO FILM (naziv, zanr) VALUES ('Hobit', 'naucna-fantastika');
INSERT INTO FILM (naziv, zanr) VALUES ('Trci, Trci', 'horor');
INSERT INTO FILM (naziv, zanr) VALUES ('Ko sam ja?', 'komedija');


INSERT INTO ODGLEDANI_FILMOVI (gledaoc_id,film_id) VALUES (2,1);
INSERT INTO ODGLEDANI_FILMOVI (gledaoc_id,film_id) VALUES (2,2);
INSERT INTO ODGLEDANI_FILMOVI (gledaoc_id,film_id) VALUES (4,1);
INSERT INTO ODGLEDANI_FILMOVI (gledaoc_id,film_id) VALUES (4,2);
INSERT INTO ODGLEDANI_FILMOVI (gledaoc_id,film_id) VALUES (4,3);
INSERT INTO ODGLEDANI_FILMOVI (gledaoc_id,film_id) VALUES (4,4);


INSERT INTO REZERVISANI_FILMOVI (gledaoc_id,film_id) VALUES (2,4);
INSERT INTO REZERVISANI_FILMOVI (gledaoc_id,film_id) VALUES (2,3);
INSERT INTO REZERVISANI_FILMOVI (gledaoc_id,film_id) VALUES (4,5);
INSERT INTO REZERVISANI_FILMOVI (gledaoc_id,film_id) VALUES (2,5);

INSERT INTO OCENA_FILM (film_id, ocena, gledaoc_id) VALUES (1,10,2);
INSERT INTO OCENA_FILM (film_id, ocena, gledaoc_id) VALUES (2,9,2);
INSERT INTO OCENA_FILM (film_id, ocena, gledaoc_id) VALUES (1,5,4);
INSERT INTO OCENA_FILM (film_id, ocena, gledaoc_id) VALUES (2,9,4);
INSERT INTO OCENA_FILM (film_id, ocena, gledaoc_id) VALUES (3,7,4);

INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-02-10', 1, 250, 1);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-03-19', 2, 200, 1);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-06-11', 3, 200, 1);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-09-14', 4, 250, 1);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-09-17', 3, 250, 2);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-09-16', 3, 250, 2);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-09-15', 2, 250, 4);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-09-13', 5, 250, 4);
INSERT INTO RASPORED(datum, film_id, cena, bioskop_id) VALUES ('2019-09-12', 1, 250, 4);

INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (1,30);
INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (2,30);
INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (3,30);
INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (4,30);
INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (5,30);
INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (6,30);
INSERT INTO TERMINSKA_LISTA(raspored_id, broj_rezervacija) VALUES (1,45);

INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (1,1);
INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (1,2);
INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (1,3);
INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (1,4);
INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (2,1);
INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (2,2);
INSERT INTO RASPORED_FILMOVA_PO_SALAMA(sala_id, terminska_lista_id) VALUES (3,6);

