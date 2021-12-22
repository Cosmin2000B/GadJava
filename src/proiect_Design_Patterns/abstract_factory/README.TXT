 Enunt problema:
     Sa presupunem ca avem o companie care vinde masini de la
doua branduri diferite (respectiv BMW si Toyota) printr-o singura
aplicatie. Dorim sa putem crea un obiect de tipul masinii dorite de
client, fara sa specificam caracteristicele modelului, intrucat stim
deja tipurile de masini pe care le vindem si caracteristicele lor.

  Rezolvarea propusa:
    Prin intermediul design pattern-ului Abstract Factory vom definii
o "fabrica" de masini care are comportamentul modelat in interfata
AbstractCarFactory. Cu ajutorul acestiei fabrici nespecializate putem
extinde conceptul in "fabrici" specializate care sa creeze modelele de masini
pe care le avem, respectiv: ToyotaFactory si BmwFactory. Caracteristicile
masinilor sunt descrise in clasele BmwCar si ToyotaCar.
    Din moment ce prin metoda de clasa public static Car getCar(AbstractCarFactory f)
din CarFactory putem sa cerem instantierea unei masini prin intermediul uneia
fabricile specializate (BmwFactory sau ToyotaFactory), reusim sa indeplinim cerinta
descrisa in enuntul problemei.