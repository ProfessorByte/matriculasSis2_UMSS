/*==============================================================*/
/* DBMS name:      Microsoft SQL Server 2016                    */
/* Created on:     4/5/2021 05:15:36                            */
/*==============================================================*/


if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ESTUDIANTES') and o.name = 'FK_ESTUDIAN_REGISTRA__CAJEROS')
alter table ESTUDIANTES
   drop constraint FK_ESTUDIAN_REGISTRA__CAJEROS
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ESTUDIA_CARRERA') and o.name = 'FK_ESTUDIA__ESTUDIA_C_ESTUDIAN')
alter table ESTUDIA_CARRERA
   drop constraint FK_ESTUDIA__ESTUDIA_C_ESTUDIAN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('ESTUDIA_CARRERA') and o.name = 'FK_ESTUDIA__ESTUDIA_C_CARRERAS')
alter table ESTUDIA_CARRERA
   drop constraint FK_ESTUDIA__ESTUDIA_C_CARRERAS
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('GRUPO') and o.name = 'FK_GRUPO_GRUPO_DOC_DOCENTES')
alter table GRUPO
   drop constraint FK_GRUPO_GRUPO_DOC_DOCENTES
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('GRUPO') and o.name = 'FK_GRUPO_GRUPO_MAT_MATERIAS')
alter table GRUPO
   drop constraint FK_GRUPO_GRUPO_MAT_MATERIAS
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('INSCRITO') and o.name = 'FK_INSCRITO_INSCRITO_ESTUDIAN')
alter table INSCRITO
   drop constraint FK_INSCRITO_INSCRITO_ESTUDIAN
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('INSCRITO') and o.name = 'FK_INSCRITO_INSCRITO2_GRUPO')
alter table INSCRITO
   drop constraint FK_INSCRITO_INSCRITO2_GRUPO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('MATERIAS') and o.name = 'FK_MATERIAS_TIENE_MAT_CARRERAS')
alter table MATERIAS
   drop constraint FK_MATERIAS_TIENE_MAT_CARRERAS
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CAJEROS')
            and   type = 'U')
   drop table CAJEROS
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CARRERAS')
            and   type = 'U')
   drop table CARRERAS
go

if exists (select 1
            from  sysobjects
           where  id = object_id('DOCENTES')
            and   type = 'U')
   drop table DOCENTES
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ESTUDIANTES')
            and   name  = 'REGISTRA_PAGO_FK'
            and   indid > 0
            and   indid < 255)
   drop index ESTUDIANTES.REGISTRA_PAGO_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ESTUDIANTES')
            and   type = 'U')
   drop table ESTUDIANTES
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ESTUDIA_CARRERA')
            and   name  = 'ESTUDIA_CARRERA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index ESTUDIA_CARRERA.ESTUDIA_CARRERA2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('ESTUDIA_CARRERA')
            and   name  = 'ESTUDIA_CARRERA_FK'
            and   indid > 0
            and   indid < 255)
   drop index ESTUDIA_CARRERA.ESTUDIA_CARRERA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('ESTUDIA_CARRERA')
            and   type = 'U')
   drop table ESTUDIA_CARRERA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('GRUPO')
            and   name  = 'GRUPO_DOCENTE_FK'
            and   indid > 0
            and   indid < 255)
   drop index GRUPO.GRUPO_DOCENTE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('GRUPO')
            and   name  = 'GRUPO_MATERIA_FK'
            and   indid > 0
            and   indid < 255)
   drop index GRUPO.GRUPO_MATERIA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('GRUPO')
            and   type = 'U')
   drop table GRUPO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('INSCRITO')
            and   name  = 'INSCRITO2_FK'
            and   indid > 0
            and   indid < 255)
   drop index INSCRITO.INSCRITO2_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('INSCRITO')
            and   name  = 'INSCRITO_FK'
            and   indid > 0
            and   indid < 255)
   drop index INSCRITO.INSCRITO_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('INSCRITO')
            and   type = 'U')
   drop table INSCRITO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('MATERIAS')
            and   name  = 'TIENE_MATERIA_FK'
            and   indid > 0
            and   indid < 255)
   drop index MATERIAS.TIENE_MATERIA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('MATERIAS')
            and   type = 'U')
   drop table MATERIAS
go

/*==============================================================*/
/* Table: CAJEROS                                               */
/*==============================================================*/
create table CAJEROS (
   CODIGO_CAJERO        varchar(9)           not null,
   APELLIDOS_CAJERO     varchar(30)          null,
   NOMBRES_CAJERO       varchar(30)          null,
   constraint PK_CAJEROS primary key (CODIGO_CAJERO)
)
go

/*==============================================================*/
/* Table: CARRERAS                                              */
/*==============================================================*/
create table CARRERAS (
   CODIGO_CARRERA       int                  not null,
   NOMBRE_CARRERA       varchar(30)          null,
   constraint PK_CARRERAS primary key (CODIGO_CARRERA)
)
go

/*==============================================================*/
/* Table: DOCENTES                                              */
/*==============================================================*/
create table DOCENTES (
   CODIGO_DOCETE        int                  not null,
   NOMBRE_DOCENTE       varchar(30)          null,
   APELLIDO_DOCENTE     varchar(30)          null,
   constraint PK_DOCENTES primary key (CODIGO_DOCETE)
)
go

/*==============================================================*/
/* Table: ESTUDIANTES                                           */
/*==============================================================*/
create table ESTUDIANTES (
   CODIGO_SIS           int                  not null,
   CODIGO_CAJERO        varchar(9)           null,
   APELLIDOS_ESTUDIANTE varchar(30)          null,
   NOMBRES_ESTUDIANTE   varchar(30)          null,
   MATRICULA_PAGADA     bit                  null,
   CONTRASENIA          varchar(30)          null,
   constraint PK_ESTUDIANTES primary key (CODIGO_SIS)
)
go

/*==============================================================*/
/* Index: REGISTRA_PAGO_FK                                      */
/*==============================================================*/




create nonclustered index REGISTRA_PAGO_FK on ESTUDIANTES (CODIGO_CAJERO ASC)
go

/*==============================================================*/
/* Table: ESTUDIA_CARRERA                                       */
/*==============================================================*/
create table ESTUDIA_CARRERA (
   CODIGO_SIS           int                  not null,
   CODIGO_CARRERA       int                  not null,
   constraint PK_ESTUDIA_CARRERA primary key (CODIGO_SIS, CODIGO_CARRERA)
)
go

/*==============================================================*/
/* Index: ESTUDIA_CARRERA_FK                                    */
/*==============================================================*/




create nonclustered index ESTUDIA_CARRERA_FK on ESTUDIA_CARRERA (CODIGO_SIS ASC)
go

/*==============================================================*/
/* Index: ESTUDIA_CARRERA2_FK                                   */
/*==============================================================*/




create nonclustered index ESTUDIA_CARRERA2_FK on ESTUDIA_CARRERA (CODIGO_CARRERA ASC)
go

/*==============================================================*/
/* Table: GRUPO                                                 */
/*==============================================================*/
create table GRUPO (
   CODIGO_GRUPO         int                  not null,
   CODIGO_MATERIA       int                  not null,
   CODIGO_DOCETE        int                  not null,
   NUMERO_GRUPO         int                  null,
   constraint PK_GRUPO primary key (CODIGO_GRUPO)
)
go

/*==============================================================*/
/* Index: GRUPO_MATERIA_FK                                      */
/*==============================================================*/




create nonclustered index GRUPO_MATERIA_FK on GRUPO (CODIGO_MATERIA ASC)
go

/*==============================================================*/
/* Index: GRUPO_DOCENTE_FK                                      */
/*==============================================================*/




create nonclustered index GRUPO_DOCENTE_FK on GRUPO (CODIGO_DOCETE ASC)
go

/*==============================================================*/
/* Table: INSCRITO                                              */
/*==============================================================*/
create table INSCRITO (
   CODIGO_SIS           int                  not null,
   CODIGO_GRUPO         int                  not null,
   constraint PK_INSCRITO primary key (CODIGO_SIS, CODIGO_GRUPO)
)
go

/*==============================================================*/
/* Index: INSCRITO_FK                                           */
/*==============================================================*/




create nonclustered index INSCRITO_FK on INSCRITO (CODIGO_SIS ASC)
go

/*==============================================================*/
/* Index: INSCRITO2_FK                                          */
/*==============================================================*/




create nonclustered index INSCRITO2_FK on INSCRITO (CODIGO_GRUPO ASC)
go

/*==============================================================*/
/* Table: MATERIAS                                              */
/*==============================================================*/
create table MATERIAS (
   CODIGO_MATERIA       int                  not null,
   CODIGO_CARRERA       int                  not null,
   NOMBRE_MATERIA       varchar(30)          null,
   DEPARTAMENTO_MATERIA varchar(30)          null,
   constraint PK_MATERIAS primary key (CODIGO_MATERIA)
)
go

/*==============================================================*/
/* Index: TIENE_MATERIA_FK                                      */
/*==============================================================*/




create nonclustered index TIENE_MATERIA_FK on MATERIAS (CODIGO_CARRERA ASC)
go

alter table ESTUDIANTES
   add constraint FK_ESTUDIAN_REGISTRA__CAJEROS foreign key (CODIGO_CAJERO)
      references CAJEROS (CODIGO_CAJERO)
go

alter table ESTUDIA_CARRERA
   add constraint FK_ESTUDIA__ESTUDIA_C_ESTUDIAN foreign key (CODIGO_SIS)
      references ESTUDIANTES (CODIGO_SIS)
go

alter table ESTUDIA_CARRERA
   add constraint FK_ESTUDIA__ESTUDIA_C_CARRERAS foreign key (CODIGO_CARRERA)
      references CARRERAS (CODIGO_CARRERA)
go

alter table GRUPO
   add constraint FK_GRUPO_GRUPO_DOC_DOCENTES foreign key (CODIGO_DOCETE)
      references DOCENTES (CODIGO_DOCETE)
go

alter table GRUPO
   add constraint FK_GRUPO_GRUPO_MAT_MATERIAS foreign key (CODIGO_MATERIA)
      references MATERIAS (CODIGO_MATERIA)
go

alter table INSCRITO
   add constraint FK_INSCRITO_INSCRITO_ESTUDIAN foreign key (CODIGO_SIS)
      references ESTUDIANTES (CODIGO_SIS)
go

alter table INSCRITO
   add constraint FK_INSCRITO_INSCRITO2_GRUPO foreign key (CODIGO_GRUPO)
      references GRUPO (CODIGO_GRUPO)
go

alter table MATERIAS
   add constraint FK_MATERIAS_TIENE_MAT_CARRERAS foreign key (CODIGO_CARRERA)
      references CARRERAS (CODIGO_CARRERA)
go

