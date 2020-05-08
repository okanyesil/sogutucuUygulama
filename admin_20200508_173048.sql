--
-- PostgreSQL database dump
--

-- Dumped from database version 10.11
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: admin; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE admin WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Turkish_Turkey.1254' LC_CTYPE = 'Turkish_Turkey.1254';


ALTER DATABASE admin OWNER TO postgres;

\connect admin

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

--
-- Name: kullaniciBilgileri; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."kullaniciBilgileri" (
    id integer,
    "Ad" character varying(2044),
    soyad character varying(2044),
    "KullaniciAdi" character varying(2044),
    "Sifre" character varying(2044)
);


ALTER TABLE public."kullaniciBilgileri" OWNER TO postgres;

--
-- Data for Name: kullaniciBilgileri; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."kullaniciBilgileri" VALUES
	(1, 'okan', 'Yeşiloğlu', 'okanyesil', '1234');


--
-- Name: kullaniciBilgileri unique_kullaniciBilgileri_id; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."kullaniciBilgileri"
    ADD CONSTRAINT "unique_kullaniciBilgileri_id" UNIQUE (id);


--
-- PostgreSQL database dump complete
--

