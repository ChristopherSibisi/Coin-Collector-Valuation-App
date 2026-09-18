# Coin Collector Valuation Application (Java)

##  Project Context & Motivation
This system acts as a financial valuation tool designed to calculate the premium collector worth of numismatic assets. It showcases modular system design by separating data entity structures from execution drivers.

## Core Technical Concepts Illustrated
- **Encapsulation:** Protects state attributes (`inCirculation`, `condition`, `mintYear`, `baseValue`) using private access modifiers and exposing them safely via public getter methods.
- **Dynamic Business Rules Engine:** Features an internal processing routine (`calculatorValue`) that evaluates asset depreciation and appreciation metrics using multi-branch conditional tracking (`switch` and `if-else` layers).
- **Modern API Integration:** Utilizes the native Java Time API (`java.time.Year`) to evaluate real-time asset age computations contextually.
