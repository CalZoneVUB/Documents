## Algemeen en overal
- Javadoc comments bij elke klasse EN elke methode, zelfs getters en setters.
Bekijk vooral eens:
http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#descriptions
http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#tag
http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#defaultconstructors
http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#throwstag
Het is dus belangrijk dat je de juiste tags gebruikt wanneer ze van toepassing zijn.
- Alle ongebruikte imports weghalen
- Beslissing maken over conventies van URL (lowercase/case sensitive)
- Snoeien in de debug messages (er zijn er volgens mij veel nutteloze) en ze eventueel via een "log" object/methode laten gaan die (dan moet je niet steeds een if-test doen)
- Regels afsnijden op 80 karakters is niet noodzakelijk, doe gewoon iets zinvol (leesbaarheid bevorderen in geval van veel parameters, ipv precies op 80 karakters afsnijden)
- Los overal de TODO's op
- In de DAO's, de closeDao functies, is er geen automatische manier om dat te doen? Sowieso dat mensen vergeten om dat te doen.

## com.vub.controller
### ActivateAccountController.java
- Lijn 26: zit een line-break in. Is deze niet overbodig?
- Lijn 45: Line-break nodig bij if-test

### AddCourseController.java
- Lijn 25: methoden beginnen met kleine letter (bv derpFaceMcgee ipv DerpFaceMcgee)

### EnrollCoursesController.java
- Is het om je in te schrijven op één vak, of meerdere vakken? EnrollCourseController <=> EnrollCoursesController

### HelloController.java
- Is deze nog nodig?

### LoginCreateController.java
- Lijn 44: Is die line-break daarin wel nodig? 
- Lijn 65: Is die line-break in de comments wel nodig?
- Lijn 72: Als je een comment zo moet opslitsen plaats je die beter op de regel ervoor

### MailController.java
- Lijn 22-28: Waarom bestaat dit?
- Lijn 51: Regel moet niet afgesneden zijn op 80 karakters

### NavigationBarController.java
- Is dit nog nuttig?

### PasswordForgetController.java
- Lijn 60-62: Lange comments gaan beter op de regel ervoor

### ProfilePageController.java
- Lijn 33: moet niet afgesneden zijn

### ReadRooms.java en test1/2/3
- Zijn deze nog nodig?

## com.vub.datadump
### Algemeen
- Er is geen commentaar bij de code

### DbLinkDump.java
- Lijn 18-20: Vermits die variabelen niet veranderen, gebruik het final keyword. Zijn deze overigens nog relevant? (hardgecodeerd is niet goed)
- Lijn 38: Ipv "null" terug te geven, gooi een exception. Men verwacht dat daar een resultSet uitkomt, geen "null" waarde
### DbTranslateDump.java
- Lijn 112: Deprecated Date object
- Lijn 113: Comments op deze manier zijn niet goed

## com.vub.db
### DbLink.java
- Lijn 100: is die lege main methode echt nodig?

### DbTranslate.java
- De manier waarop SQL queries worden geconcateneerd is SQL-injectie-paradijs. Verander deze allemaal zodat er gebruik gemaakt wordt van connection.prepareStatement(); 
http://stackoverflow.com/questions/1812891/java-escape-string-to-prevent-sql-injection (voorbeeld 1)
http://stackoverflow.com/questions/370818/cleanest-way-to-build-an-sql-string-in-java (voorbeeld 2)

## com.vub.model
### Room.java
- Fix deprecated javadoc commentaar (is daar geen annotatie voor? @deprecated ofzo?)

## com.vub.validators
### Algemeen
- Zijn deze files wel nodig? 
- Bij veel files zit slechte indentatie (spaties ipv tabs)
