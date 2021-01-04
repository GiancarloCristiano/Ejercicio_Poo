-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2020-12-23 19:40:11.956

-- tables
-- Table: DISENIADOR
CREATE TABLE DISENIADOR (
    id_empleado int  NOT NULL,
    tipo_diseniador varchar(7)  NOT NULL,
    CONSTRAINT ID_EMPLEADO_DISENIADOR PRIMARY KEY (id_empleado)
);

-- Table: EMPLEADO
CREATE TABLE EMPLEADO (
    id_empresa int  NOT NULL,
    id int  NOT NULL,
    nombre varchar(25)  NOT NULL,
    apellido varchar(25)  NOT NULL,
    tipo_empleado char(1)  NOT NULL,
    CONSTRAINT ID_EMPLEADO PRIMARY KEY (id)
);

-- Table: EMPRESA
CREATE TABLE EMPRESA (
    id int  NOT NULL,
    nombre varchar(25)  NOT NULL,
    CONSTRAINT ID_EMPRESA PRIMARY KEY (id)
);

-- Table: PROGRAMADOR
CREATE TABLE PROGRAMADOR (
    id_empleado int  NOT NULL,
    lenguaje_prog varchar(6)  NOT NULL,
    CONSTRAINT ID_EMPLEADO_PROGRAMADOR PRIMARY KEY (id_empleado)
);

-- foreign keys
-- Reference: DISENIADOR_EMPLEADO (table: DISENIADOR)
ALTER TABLE DISENIADOR ADD CONSTRAINT DISENIADOR_EMPLEADO
    FOREIGN KEY (id_empleado)
    REFERENCES EMPLEADO (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: EMPLEADO_EMPRESA (table: EMPLEADO)
ALTER TABLE EMPLEADO ADD CONSTRAINT EMPLEADO_EMPRESA
    FOREIGN KEY (id_empresa)
    REFERENCES EMPRESA (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: PROGRAMADOR_EMPLEADO (table: PROGRAMADOR)
ALTER TABLE PROGRAMADOR ADD CONSTRAINT PROGRAMADOR_EMPLEADO
    FOREIGN KEY (id_empleado)
    REFERENCES EMPLEADO (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

