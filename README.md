# ScrollingText

Preprosta Android aplikacija za prikaz daljšega besedila z možnostjo navpičnega drsenja, izdelana v programskem jeziku **Java** z uporabo **XML**.

Projekt je bil razvit v okolju Android Studio kot del šolske naloge pri predmetu Razvoj mobilnih aplikacij.

## Funkcionalnosti

- Prikaz daljšega besedila članka o glasbeni skupini The Beatles.
- Navpično pomikanje po vsebini z uporabo `ScrollView`.
- Razporeditev besedila v dva stolpca z uporabo `LinearLayout`.
- Ožji levi stolpec za podnaslov in širši desni stolpec za glavno besedilo.
- Prikaz naslovov in besedila z uporabo `TextView`.
- Upravljanje besedilnih virov prek datoteke `strings.xml`.
- Prikaz obvestila **Comment submitted!** z uporabo `Toast` ob pritisku na gumb.

## Uporabljene tehnologije

| Tehnologija | Namen |
|---|---|
| Java | Programska logika in obdelava dogodkov |
| XML | Oblikovanje uporabniškega vmesnika |
| ScrollView | Navpično pomikanje po vsebini |
| LinearLayout | Razporeditev besedila v dva stolpca |
| TextView | Prikaz naslovov in besedila |
| Android Studio | Razvojno okolje |
| Gradle | Gradnja in upravljanje projekta |

## Delovanje aplikacije

Aplikacija prikazuje članek o glasbeni skupini The Beatles in njihovi zbirki posnetkov **Anthology**.

Vsebina je razdeljena na dva stolpca. Levi stolpec širine 100dp prikazuje podnaslov, desni pa glavno besedilo članka.

Za razporeditev je uporabljen vodoravni LinearLayout znotraj gradnika ScrollView, ki omogoča pregledovanje daljšega besedila z navpičnim drsenjem.

Besedila so shranjena v datoteki `strings.xml` in uporabljena prek sklicev na besedilne vire.

Na spodnjem delu aplikacije je gumb za oddajo komentarja, ki ob pritisku prikaže kratko obvestilo **Comment submitted!**.

## Zagon projekta

1. Prenesite ali klonirajte repozitorij.
2. Odprite projekt v Android Studiu.
3. Počakajte, da se zaključi sinhronizacija Gradle.
4. Izberite Android emulator ali fizično napravo.
5. Zaženite aplikacijo z gumbom **Run**.

## Namen projekta

Cilj projekta je spoznati uporabo gradnikov ScrollView, LinearLayout in TextView za prikaz daljših besedil ter pravilno razporejanje vsebine v več stolpcev.

Projekt omogoča tudi utrjevanje uporabe besedilnih virov in osnovne obdelave uporabniških dogodkov.

Projekt je namenjen izključno izobraževalnim namenom.
