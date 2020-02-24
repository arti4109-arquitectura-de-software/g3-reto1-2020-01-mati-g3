--------------------------------------------------------
-- Archivo creado  - s�bado-febrero-22-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ORDEN
--------------------------------------------------------

  CREATE TABLE "TIANGUIX"."ORDEN" 
   (	"ID" VARCHAR2(20 BYTE), 
	"ID_PRODUCTO" VARCHAR2(20 BYTE), 
	"TIPO" VARCHAR2(6 BYTE), 
	"CANTIDAD" NUMBER, 
	"VALOR_UNIDAD" NUMBER, 
	"VALOR_TOTAL" NUMBER, 
	"VIGENCIA_INICIAL" DATE, 
	"VIGENCIA_FINAL" DATE
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index ORDEN_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "TIANGUIX"."ORDEN_PK" ON "TIANGUIX"."ORDEN" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table ORDEN
--------------------------------------------------------

  ALTER TABLE "TIANGUIX"."ORDEN" ADD CONSTRAINT "ORDEN_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS"  ENABLE;
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("ID_PRODUCTO" NOT NULL ENABLE);
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("TIPO" NOT NULL ENABLE);
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("CANTIDAD" NOT NULL ENABLE);
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("VALOR_UNIDAD" NOT NULL ENABLE);
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("VALOR_TOTAL" NOT NULL ENABLE);
 
  ALTER TABLE "TIANGUIX"."ORDEN" MODIFY ("VIGENCIA_INICIAL" NOT NULL ENABLE);
