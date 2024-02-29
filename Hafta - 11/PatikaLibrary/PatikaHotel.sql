PGDMP                      |            patikalibrary    16.1    16.1 C    L           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            M           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            N           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            O           1262    17835    patikalibrary    DATABASE     o   CREATE DATABASE patikalibrary WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
    DROP DATABASE patikalibrary;
                postgres    false            �            1259    17837    authors    TABLE     �   CREATE TABLE public.authors (
    author_id integer NOT NULL,
    author_birth_date date NOT NULL,
    author_country character varying(255) NOT NULL,
    author_name character varying(255) NOT NULL
);
    DROP TABLE public.authors;
       public         heap    postgres    false            �            1259    17836    authors_author_id_seq    SEQUENCE     �   CREATE SEQUENCE public.authors_author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.authors_author_id_seq;
       public          postgres    false    216            P           0    0    authors_author_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.authors_author_id_seq OWNED BY public.authors.author_id;
          public          postgres    false    215            �            1259    17848    books    TABLE     �   CREATE TABLE public.books (
    book_id integer NOT NULL,
    book_name character varying(255) NOT NULL,
    book_pub_year date NOT NULL,
    book_stock integer NOT NULL,
    book_author_id integer NOT NULL,
    book_publisher_id integer NOT NULL
);
    DROP TABLE public.books;
       public         heap    postgres    false            �            1259    17858 	   books2cat    TABLE     v   CREATE TABLE public.books2cat (
    books2cat_book_id integer NOT NULL,
    books2cat_category_id integer NOT NULL
);
    DROP TABLE public.books2cat;
       public         heap    postgres    false            �            1259    17856    books2cat_books2cat_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books2cat_books2cat_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 6   DROP SEQUENCE public.books2cat_books2cat_book_id_seq;
       public          postgres    false    223            Q           0    0    books2cat_books2cat_book_id_seq    SEQUENCE OWNED BY     c   ALTER SEQUENCE public.books2cat_books2cat_book_id_seq OWNED BY public.books2cat.books2cat_book_id;
          public          postgres    false    221            �            1259    17857 #   books2cat_books2cat_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books2cat_books2cat_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 :   DROP SEQUENCE public.books2cat_books2cat_category_id_seq;
       public          postgres    false    223            R           0    0 #   books2cat_books2cat_category_id_seq    SEQUENCE OWNED BY     k   ALTER SEQUENCE public.books2cat_books2cat_category_id_seq OWNED BY public.books2cat.books2cat_category_id;
          public          postgres    false    222            �            1259    17846    books_book_author_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_author_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.books_book_author_id_seq;
       public          postgres    false    220            S           0    0    books_book_author_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.books_book_author_id_seq OWNED BY public.books.book_author_id;
          public          postgres    false    218            �            1259    17845    books_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.books_book_id_seq;
       public          postgres    false    220            T           0    0    books_book_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.books_book_id_seq OWNED BY public.books.book_id;
          public          postgres    false    217            �            1259    17847    books_book_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.books_book_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.books_book_publisher_id_seq;
       public          postgres    false    220            U           0    0    books_book_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.books_book_publisher_id_seq OWNED BY public.books.book_publisher_id;
          public          postgres    false    219            �            1259    17865    borrowedbooks    TABLE     �   CREATE TABLE public.borrowedbooks (
    borrow_id integer NOT NULL,
    borrow_date date NOT NULL,
    borrower_name character varying(255) NOT NULL,
    returning_date date,
    borrow_book_id integer NOT NULL
);
 !   DROP TABLE public.borrowedbooks;
       public         heap    postgres    false            �            1259    17864     borrowedbooks_borrow_book_id_seq    SEQUENCE     �   CREATE SEQUENCE public.borrowedbooks_borrow_book_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 7   DROP SEQUENCE public.borrowedbooks_borrow_book_id_seq;
       public          postgres    false    226            V           0    0     borrowedbooks_borrow_book_id_seq    SEQUENCE OWNED BY     e   ALTER SEQUENCE public.borrowedbooks_borrow_book_id_seq OWNED BY public.borrowedbooks.borrow_book_id;
          public          postgres    false    225            �            1259    17863    borrowedbooks_borrow_id_seq    SEQUENCE     �   CREATE SEQUENCE public.borrowedbooks_borrow_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.borrowedbooks_borrow_id_seq;
       public          postgres    false    226            W           0    0    borrowedbooks_borrow_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.borrowedbooks_borrow_id_seq OWNED BY public.borrowedbooks.borrow_id;
          public          postgres    false    224            �            1259    17875 
   categories    TABLE     �   CREATE TABLE public.categories (
    category_id integer NOT NULL,
    category_description character varying(255) NOT NULL,
    category_name character varying(255) NOT NULL
);
    DROP TABLE public.categories;
       public         heap    postgres    false            �            1259    17874    categories_category_id_seq    SEQUENCE     �   CREATE SEQUENCE public.categories_category_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.categories_category_id_seq;
       public          postgres    false    228            X           0    0    categories_category_id_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.categories_category_id_seq OWNED BY public.categories.category_id;
          public          postgres    false    227            �            1259    17884 
   publishers    TABLE     �   CREATE TABLE public.publishers (
    publisher_id integer NOT NULL,
    publisher_address character varying(255) NOT NULL,
    publisher_establishment date NOT NULL,
    publisher_name character varying(255) NOT NULL
);
    DROP TABLE public.publishers;
       public         heap    postgres    false            �            1259    17883    publishers_publisher_id_seq    SEQUENCE     �   CREATE SEQUENCE public.publishers_publisher_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.publishers_publisher_id_seq;
       public          postgres    false    230            Y           0    0    publishers_publisher_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.publishers_publisher_id_seq OWNED BY public.publishers.publisher_id;
          public          postgres    false    229            �           2604    17840    authors author_id    DEFAULT     v   ALTER TABLE ONLY public.authors ALTER COLUMN author_id SET DEFAULT nextval('public.authors_author_id_seq'::regclass);
 @   ALTER TABLE public.authors ALTER COLUMN author_id DROP DEFAULT;
       public          postgres    false    216    215    216            �           2604    17851    books book_id    DEFAULT     n   ALTER TABLE ONLY public.books ALTER COLUMN book_id SET DEFAULT nextval('public.books_book_id_seq'::regclass);
 <   ALTER TABLE public.books ALTER COLUMN book_id DROP DEFAULT;
       public          postgres    false    217    220    220            �           2604    17852    books book_author_id    DEFAULT     |   ALTER TABLE ONLY public.books ALTER COLUMN book_author_id SET DEFAULT nextval('public.books_book_author_id_seq'::regclass);
 C   ALTER TABLE public.books ALTER COLUMN book_author_id DROP DEFAULT;
       public          postgres    false    220    218    220            �           2604    17853    books book_publisher_id    DEFAULT     �   ALTER TABLE ONLY public.books ALTER COLUMN book_publisher_id SET DEFAULT nextval('public.books_book_publisher_id_seq'::regclass);
 F   ALTER TABLE public.books ALTER COLUMN book_publisher_id DROP DEFAULT;
       public          postgres    false    219    220    220            �           2604    17861    books2cat books2cat_book_id    DEFAULT     �   ALTER TABLE ONLY public.books2cat ALTER COLUMN books2cat_book_id SET DEFAULT nextval('public.books2cat_books2cat_book_id_seq'::regclass);
 J   ALTER TABLE public.books2cat ALTER COLUMN books2cat_book_id DROP DEFAULT;
       public          postgres    false    223    221    223            �           2604    17862    books2cat books2cat_category_id    DEFAULT     �   ALTER TABLE ONLY public.books2cat ALTER COLUMN books2cat_category_id SET DEFAULT nextval('public.books2cat_books2cat_category_id_seq'::regclass);
 N   ALTER TABLE public.books2cat ALTER COLUMN books2cat_category_id DROP DEFAULT;
       public          postgres    false    223    222    223            �           2604    17868    borrowedbooks borrow_id    DEFAULT     �   ALTER TABLE ONLY public.borrowedbooks ALTER COLUMN borrow_id SET DEFAULT nextval('public.borrowedbooks_borrow_id_seq'::regclass);
 F   ALTER TABLE public.borrowedbooks ALTER COLUMN borrow_id DROP DEFAULT;
       public          postgres    false    224    226    226            �           2604    17869    borrowedbooks borrow_book_id    DEFAULT     �   ALTER TABLE ONLY public.borrowedbooks ALTER COLUMN borrow_book_id SET DEFAULT nextval('public.borrowedbooks_borrow_book_id_seq'::regclass);
 K   ALTER TABLE public.borrowedbooks ALTER COLUMN borrow_book_id DROP DEFAULT;
       public          postgres    false    225    226    226            �           2604    17878    categories category_id    DEFAULT     �   ALTER TABLE ONLY public.categories ALTER COLUMN category_id SET DEFAULT nextval('public.categories_category_id_seq'::regclass);
 E   ALTER TABLE public.categories ALTER COLUMN category_id DROP DEFAULT;
       public          postgres    false    228    227    228            �           2604    17887    publishers publisher_id    DEFAULT     �   ALTER TABLE ONLY public.publishers ALTER COLUMN publisher_id SET DEFAULT nextval('public.publishers_publisher_id_seq'::regclass);
 F   ALTER TABLE public.publishers ALTER COLUMN publisher_id DROP DEFAULT;
       public          postgres    false    229    230    230            ;          0    17837    authors 
   TABLE DATA           \   COPY public.authors (author_id, author_birth_date, author_country, author_name) FROM stdin;
    public          postgres    false    216   TP       ?          0    17848    books 
   TABLE DATA           q   COPY public.books (book_id, book_name, book_pub_year, book_stock, book_author_id, book_publisher_id) FROM stdin;
    public          postgres    false    220   	Q       B          0    17858 	   books2cat 
   TABLE DATA           M   COPY public.books2cat (books2cat_book_id, books2cat_category_id) FROM stdin;
    public          postgres    false    223   YQ       E          0    17865    borrowedbooks 
   TABLE DATA           n   COPY public.borrowedbooks (borrow_id, borrow_date, borrower_name, returning_date, borrow_book_id) FROM stdin;
    public          postgres    false    226   �Q       G          0    17875 
   categories 
   TABLE DATA           V   COPY public.categories (category_id, category_description, category_name) FROM stdin;
    public          postgres    false    228   �Q       I          0    17884 
   publishers 
   TABLE DATA           n   COPY public.publishers (publisher_id, publisher_address, publisher_establishment, publisher_name) FROM stdin;
    public          postgres    false    230   DR       Z           0    0    authors_author_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.authors_author_id_seq', 7, true);
          public          postgres    false    215            [           0    0    books2cat_books2cat_book_id_seq    SEQUENCE SET     N   SELECT pg_catalog.setval('public.books2cat_books2cat_book_id_seq', 1, false);
          public          postgres    false    221            \           0    0 #   books2cat_books2cat_category_id_seq    SEQUENCE SET     R   SELECT pg_catalog.setval('public.books2cat_books2cat_category_id_seq', 1, false);
          public          postgres    false    222            ]           0    0    books_book_author_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.books_book_author_id_seq', 1, false);
          public          postgres    false    218            ^           0    0    books_book_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.books_book_id_seq', 14, true);
          public          postgres    false    217            _           0    0    books_book_publisher_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.books_book_publisher_id_seq', 1, false);
          public          postgres    false    219            `           0    0     borrowedbooks_borrow_book_id_seq    SEQUENCE SET     O   SELECT pg_catalog.setval('public.borrowedbooks_borrow_book_id_seq', 1, false);
          public          postgres    false    225            a           0    0    borrowedbooks_borrow_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.borrowedbooks_borrow_id_seq', 5, true);
          public          postgres    false    224            b           0    0    categories_category_id_seq    SEQUENCE SET     H   SELECT pg_catalog.setval('public.categories_category_id_seq', 8, true);
          public          postgres    false    227            c           0    0    publishers_publisher_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.publishers_publisher_id_seq', 4, true);
          public          postgres    false    229            �           2606    17844    authors authors_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (author_id);
 >   ALTER TABLE ONLY public.authors DROP CONSTRAINT authors_pkey;
       public            postgres    false    216            �           2606    17855    books books_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (book_id);
 :   ALTER TABLE ONLY public.books DROP CONSTRAINT books_pkey;
       public            postgres    false    220            �           2606    17873     borrowedbooks borrowedbooks_pkey 
   CONSTRAINT     e   ALTER TABLE ONLY public.borrowedbooks
    ADD CONSTRAINT borrowedbooks_pkey PRIMARY KEY (borrow_id);
 J   ALTER TABLE ONLY public.borrowedbooks DROP CONSTRAINT borrowedbooks_pkey;
       public            postgres    false    226            �           2606    17882    categories categories_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT categories_pkey PRIMARY KEY (category_id);
 D   ALTER TABLE ONLY public.categories DROP CONSTRAINT categories_pkey;
       public            postgres    false    228            �           2606    17891    publishers publishers_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public.publishers
    ADD CONSTRAINT publishers_pkey PRIMARY KEY (publisher_id);
 D   ALTER TABLE ONLY public.publishers DROP CONSTRAINT publishers_pkey;
       public            postgres    false    230            �           2606    17893 '   categories uk_41g4n0emuvcm3qyf1f6cn43c0 
   CONSTRAINT     k   ALTER TABLE ONLY public.categories
    ADD CONSTRAINT uk_41g4n0emuvcm3qyf1f6cn43c0 UNIQUE (category_name);
 Q   ALTER TABLE ONLY public.categories DROP CONSTRAINT uk_41g4n0emuvcm3qyf1f6cn43c0;
       public            postgres    false    228            �           2606    17909 %   books2cat fk3m4pkyl3ey1dih0y20oe0vepc    FK CONSTRAINT     �   ALTER TABLE ONLY public.books2cat
    ADD CONSTRAINT fk3m4pkyl3ey1dih0y20oe0vepc FOREIGN KEY (books2cat_book_id) REFERENCES public.books(book_id);
 O   ALTER TABLE ONLY public.books2cat DROP CONSTRAINT fk3m4pkyl3ey1dih0y20oe0vepc;
       public          postgres    false    3485    220    223            �           2606    17894 !   books fk44cp76hd0fv4lg6cbdruskfvn    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn FOREIGN KEY (book_author_id) REFERENCES public.authors(author_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk44cp76hd0fv4lg6cbdruskfvn;
       public          postgres    false    220    216    3483            �           2606    17899 !   books fk53bw245gmvw9eamjbtwgrxuj3    FK CONSTRAINT     �   ALTER TABLE ONLY public.books
    ADD CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3 FOREIGN KEY (book_publisher_id) REFERENCES public.publishers(publisher_id);
 K   ALTER TABLE ONLY public.books DROP CONSTRAINT fk53bw245gmvw9eamjbtwgrxuj3;
       public          postgres    false    230    220    3493            �           2606    17904 %   books2cat fkmvxlqu917m6ut1he4jipivu4s    FK CONSTRAINT     �   ALTER TABLE ONLY public.books2cat
    ADD CONSTRAINT fkmvxlqu917m6ut1he4jipivu4s FOREIGN KEY (books2cat_category_id) REFERENCES public.categories(category_id);
 O   ALTER TABLE ONLY public.books2cat DROP CONSTRAINT fkmvxlqu917m6ut1he4jipivu4s;
       public          postgres    false    3489    223    228            �           2606    17914 )   borrowedbooks fkq9wdjubhbpqrna8wvxu5f6vaq    FK CONSTRAINT     �   ALTER TABLE ONLY public.borrowedbooks
    ADD CONSTRAINT fkq9wdjubhbpqrna8wvxu5f6vaq FOREIGN KEY (borrow_book_id) REFERENCES public.books(book_id);
 S   ALTER TABLE ONLY public.borrowedbooks DROP CONSTRAINT fkq9wdjubhbpqrna8wvxu5f6vaq;
       public          postgres    false    220    226    3485            ;   �   x�M˽�0���*z%��:���l����Q4�%���x�n�}y&c�m��EL��H�J����/o�Բ#~��y�^�BL$%�	�Gj�#ߢ6�8�m�'t�l !�KJ�rv�V��|�2�Y.$U�6����J^�])E�������c�|=L��S  _�|6�      ?   @   x�34�tL>�Q�#�2������@��X����ԀӘӐ�Є3$�$C��!���	�	W� �I�      B      x�34�4�24�4����� @�      E   :   x�3�4202�54�54�t��Tp,��pq�"�p?�'/95''57E�	W� �
�      G   j   x�3�tO-:�<5;��ƣ�lT��I��I,�tK�+I,.���2�t)�L/
*�S�Z������R����eӭ��yt~fHR!#�2���FN������ĴL�=... "�)�      I   h   x�3�<���$1/�4�����B��P�Ȉ3 5=�����E��R��X��(X�����e�阗�X��3�5 j5���2�"�~xO^rj��kYQj^qjW� ͽ%�     