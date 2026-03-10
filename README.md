# Aplikacja internetowa księgarni
    Aplikacja internetowa służąca do przeglądania i zamawiania książek online.

## Stos Technologii
    Frontend: Next.js + TypeScript
  
    Backend: Spring Boot
  
    Database: PostgreSQL

## Struktura Projektu
    backend/ – część backendowa aplikacji
  
    frontend/ – część frontendowa aplikacji

## Sprint Plan
  ### Sprint 1 (Tydzień 1–2)
  Cel sprintu: Przygotowanie architektury projektu oraz implementacja podstawowej funkcjonalności katalogu książek.
  #### Backend:
    Inicjalizacja projektu backend
    Konfiguracja połączenia z bazą danych PostgreSQL
    Utworzenie encji Book
    Implementacja BookRepository
    Implementacja BookService
    Implementacja BookController z endpointami:
      GET /api/books
      GET /api/books/{id}
      POST /api/books
    Testowanie endpointów w Postman
  #### Frontend:
    Inicjalizacja projektu frontend
    Konfiguracja struktury katalogów projektu
    Przygotowanie makiet UI w Figma
    Konfiguracja routingu aplikacji
    Tworzenie strony głównej aplikacji
    Integracja API:
      Pobieranie listy książek z backendu
      Wyświetlanie książek na stronie głównej
  ### Spring 2 (Tydzień 3-4)
  Cel sprintu: Implementacja systemu użytkowników (rejestracja i logowanie).
  #### Backend:
    Utworzenie encji User
    Implementacja UserRepository
    Implementacja UserService
    Implementacja AuthController
    Endpointy API:
      POST /api/auth/register
      POST /api/auth/login
    Bezpieczeństwo:
      Implementacja szyfrowania haseł (BCrypt)
      Implementacja JWT
      Konfiguracja Spring Security
  #### Frontend:
    Implementacja LoginPage
    Implementacja RegisterPage
    Formularz logowania
    Formularz rejestracji
    Integracja z API logowania i rejestracji
    Zapisywanie tokenu JWT




## Autorzy
  Artiom Prilepschi
  
  Nazar Pavlenko
