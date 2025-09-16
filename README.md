# Projekt - Statystyka opisowa
## Opis
Projekt na przedmiot "Statystyka opisowa" na II roku studiów inżynierskich na kierunku Informatyka i ekonometria na UR. Projekt dotyczy analizy danych z wykorzystaniem metod statystyki opisowej w języku R. W notatniku pokazano m.in. przygotowanie danych, obliczenia podstawowych miar (średnia, mediana, wariancja, odchylenie standardowe), wizualizacje oraz interpretacje wyników. Celem projektu jest praktyczne wykorzystanie statystyki opisowej do analizy zbioru danych i przedstawienie wyników w czytelnej formie.

## Technologie
Projekt został wykonany przy użyciu:
* R (w środowisku Google Colab)
* Pakiety:
  * googledrive – obsługa plików z Google Drive
  * readxl – import danych z plików Excel
  * (opcjonalnie inne pakiety wbudowane w R: stats, base)

## Wymagania
Do uruchomienia projektu potrzebne są:
* Konto Google oraz dostęp do Google Colab
* Środowisko R w Colab (link: https://colab.to/r)
* Zainstalowane pakiety R:
  * `install.packages("googledrive")`
  * `install.packages("readxl")`


## Instrukcja uruchomienia
1. Otwórz Google Colab w trybie R: https://colab.to/r
2. Sklonuj repozytorium komendą `git clone https://github.com/michalzychowski/Projekt_Statystyka_opisowa.git`
3. Otwórz plik project.ipynb w Colabie.
4. Uruchom kolejne komórki kodu, aby wczytać dane i przeprowadzić analizę.

## Uwagi
Projekt został wykonany zgodnie z instrukcją zawartą w pliku [zadanie_projektowe.pdf](documentation/zadanie_projektowe.pdf) w folderze documentation.
Analizowane dane znajdują się w pliku Excela (Results.xlsx). W celu uproszczenia uzyskania danych, zostały one wygenerowane przez prosty kod w języku Java.
Kod można uruchomić także lokalnie w RStudio po zainstalowaniu wymaganych pakietów.
Projekt możemy również uruchomić w Jupyter Notebook po zainstalowaniu kernel dla R.

## Licencja
Projekt jest dostępny na licencji [MIT](LICENSE).
