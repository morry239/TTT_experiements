package prog1.rep.a;

//<sichtbarkeit> class <identifier>{}
//<sichtbarkeit> class <identifier> extends <Baseclass> {} bei Vererbung
//<sichtbarkeit> class <identifier> extends <Baseclass> implements <schnittstelle1>, <schnittstelle2>
//jede Java klasse hat nur eine basisklasse verfügen
//aber kann es beliebig viele Schnittstelle verfügen
//<sichtbarkeit> class abstract <identifier> {} <-- keine Objekte/keine Instanzen hier inizialisiert werden aber konstruktor kann. spezialisierbar.
//<sichtbarkeit> final class <identifier> {} <--- inizializierbar aber keine spezialisierung, d.h. keine Vererbung
// es gibt KEINE final abstrakt klasse!! das wäre ein Widerspruch
// konstruktor inizialisiert die attriburtierte Werte. ohne Rückgabetyp hieß er Standardkonstruktor
// <sichtbarkeit> <klassenname> ([<Typ1> <Identifier 1>, ...]) {}
//attribute mit eigenschaften definiert man: <Sichtbarkeit> <Typ> <Identifier>; oder <Sichtbarkeit> <Typ> <Identifier> = <Initialisierung>;
/* methoden inizialisieren
* <sichtbarkeit> <rückgabetyp><identifier> ([<Typ1> <Identifier 1>, ...]) {}
* <sichtbarkeit> abstrakt <rückgabetyp><identifier> ([<Typ1> <Identifier 1>, ...]);
*
* */

//dasselbe klassennamen aber mit unterschiedlichen parameter typen (aka unterschiedlichen varianten) schreiben --> methode überLADEN
//überschreiben ist alles gleich <-- abstrakte methode muss die Spezialisierung überSCHREIBEN
// abstrakt klasse OHNE abstrakte Methoden ist zulässig
//reine abstrakt klasse (nur abstrakte methode drin) == macht Schnittstelle
/* <Sichtbarkeit> interface <Identifier> [extends <BaseInterface1>, <BaseInterface2>, ...] --> mehrfach Schnittstelle zulässig, mehrfach vererbung NICHT */
/*methode in schnittstelle-Klassen <Rückgabetyp> <identifier> ([<Typ1> <Identifier 1>, ...] );*/
/*for(<Elementtyp><Identifier>:<Feld>){}*/
/* in der Main methode--
Main m = new Main();
int z = m.foo(5); //int foo methode ist inizialisiert
System.out.pringln(z);
 */

public class Main {
}
