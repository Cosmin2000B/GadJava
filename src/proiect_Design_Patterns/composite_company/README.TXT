 Enunt problema: 
  Presupunem ca avem o companie in care angajatii
pot fi "software developer" sau "human resources specialist".
Fiecare angajat poate avea un "manager" direct, iar un
manager poate avea in subordine niciun angajat, un singur angajat
sau mai multi angajati din cele 2 domenii.
  Ne dorim sa cream o aplicatie care ne permite sa structuram
ierarhic angajatii companiei in functie de managerul direct al
fiecarui angajat si sa putem premia unul sau mai multi angajati
pentru reusitele lor. Consideram ca premierea se va face prin
intermediul managerului direct superior dpdv ierarhic al 
angajatului/angajatilor.

  Rezolvarea propusa:
    Prin intermediul design pattern-ului composite putem organiza
angajatii intr-o maniera arborescenta, parintele unui angajat fiind
manager-ul acestuia. Astfel, putem mentine structura ierarhica a intregii
companii pe masura ce adaugam angajatii din ea.
    Intrucat composite ne permite sa retinem ierarhia companiei, ne va fi
usor sa premiem angajatii prin intermediul managerului lor, acest lucru fiind
realizat prin metodele  public void rewardEmployee(Employee e, int sum)
(pentru un singur angajat) si public void rewardSupervised(int sum) (pentru
toti angajatii din subordinea managerului respectiv daca sunt developeri sau
de la resurse umane) din clasa Manager.