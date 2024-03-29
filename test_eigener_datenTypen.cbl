IDENTIFICATION DIVISION.
PROGRAM-ID. Hallo.

DATA DIVISION.
WORKING-STORAGE SECTION.
01 WS-NUM1 PIC S9(7)V9(4).
01 WS-NUM2 PIC PP999.
01 WS-NUM3 PIC s9(4)V9(3) VALUE -1234.456.
01 WS-NAME PIC A(7) VALUE 'Mathias'.
01 WS-ID PIC X(6) VALUE 'AB121$'.

PROCEDURE DIVISION.
DISPLAY "WS-NUM1 : "WS-NUM1.
DISPLAY "WS-NUM2 : "WS-NUM2.
DISPLAY "WS-NUM3 : "WS-NUM3.
DISPLAY "WS-NAME : "WS-NAME.
DISPLAY "WS-ID : "WS-ID.
STOP RUN.

//SAMPLE JOB(TESTJCL,XXXXXX),CLASS=A,MSGCLASS=C
//STEP1 EXEC PGM=HALLO

// eigene Ausführungen/Weiterführungen eines Beispiels nach: https://www.tutorialspoint.com/de/cobol/cobol_data_types.htm

// Ausgabe nach Kompilieren:
// WS-NUM1 : +0000000.0000
// WS-NUM2 : .00000
// WS-NUM3 : -1234.456
// WS-NAME : Mathias
// WS-ID : AB121$