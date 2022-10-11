IDENTIFICATION DIVISION.
PROGRAM-ID. LOOP.

DATA DIVISION.
   WORKING-STORAGE SECTION.
   01 WS-A PIC 9 VALUE 0.

PROCEDURE DIVISION.
   A-PARA.
   PERFORM B-PARA VARYING WS-A FROM 1 BY 1 UNTIL WS-A=10
   STOP RUN.
   
   B-PARA.
   DISPLAY 'IN B-PARA ' WS-A.
   
//SAMPLE JOB(TESTJCL,XXXXXX),CLASS=A,MSGCLASS=C
//STEP1 EXEC PGM=LOOP

// eigene Ausführungen/Weiterführungen eines Beispiels nach: https://www.tutorialspoint.com/de/cobol/cobol_loop_statements.htm

// Ausgabe nach Kompilieren:
// IN B-PARA 1
// IN B-PARA 2
// IN B-PARA 3
// IN B-PARA 4
// IN B-PARA 5 
// IN B-PARA 6
// IN B-PARA 7
// IN B-PARA 8
// IN B-PARA 9