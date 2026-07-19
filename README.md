# Expense Manager (Java Console App)

A console application for tracking personal expenses,
built to practice core Java and OOP.

## Features
- Add one-time and recurring expenses (inheritance + polymorphism)
- List, total, keyword search, delete
- Input validation in a menu loop

## What I learned
- Separation of concerns: I/O lives in Main, domain classes stay pure
- Why Strings need .equals(), and why closing a Scanner on System.in is a trap

## Known limitations
- Dates are plain Strings (no validation yet) — planned: LocalDate
- No persistence yet — expenses vanish on exit