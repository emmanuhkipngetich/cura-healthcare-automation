
# CURA Healthcare Automation Framework

Enterprise-grade Selenium Automation Framework for the CURA Healthcare demo application using:

- Selenium WebDriver
- Java
- Maven
- Cucumber BDD
- TestNG
- Page Object Model (POM)
- Allure Reports
- GitHub Actions CI/CD

---

# Project Author

**Emmanuel Bore**

Software Quality Assurance Engineer | SDET | Automation Engineer

---

# Application Under Test

https://katalon-demo-cura.herokuapp.com/

---

# Tech Stack

| Technology | Version |
|---|---|
| Java | 17 |
| Selenium | 4.21.0 |
| Maven | 3+ |
| Cucumber | 7.18.0 |
| TestNG | 7.10.2 |
| Allure Report | 2.29.0 |
| WebDriverManager | 5.8.0 |

---

# Framework Architecture

```text
src
 └── test
      ├── java
      │    ├── base
      │    ├── hooks
      │    ├── pages
      │    ├── runners
      │    ├── steps
      │    └── utils
      │
      └── resources
           └── features
```

---

# Features Implemented

## Login Automation

- Launch application
- Login with valid credentials
- Navigate to appointment page

## Appointment Booking

- Select facility
- Select healthcare program
- Enter visit date
- Add comments
- Book appointment
- Validate confirmation page

## Framework Features

- Reusable Page Object Model
- Cucumber BDD Scenarios
- TestNG Execution
- Maven Build Management
- Allure Reporting
- Hooks Management
- Explicit Wait Utilities
- Enterprise Folder Structure

---

# Test Scenarios

## Smoke Tests

- Successful Login
- Book Appointment with Medicare

## Regression Tests

- Tokyo Facility Booking
- Seoul Facility Booking
- Hongkong Facility Booking
- Multiple Healthcare Programs
- Appointment Confirmation Validation

---

# Design Pattern Used

## Page Object Model (POM)

The framework follows the Page Object Model design pattern for:

- code reusability
- maintainability
- scalability
- cleaner test structure

---

# Setup Instructions

## Clone Repository

```bash
git clone https://github.com/emmanuhkipngetich?tab=repositories
```

---

## Open Project

Open the project in:

- IntelliJ IDEA
- VS Code

---

## Install Dependencies

```bash
mvn clean install
```

---

# Run Tests

```bash
mvn clean test
```

---

# Generate Allure Report

## Install Allure (Mac)

```bash
brew install allure
```

---

## Generate Report

```bash
allure serve target/allure-results
```

---

# GitHub Actions CI/CD

This framework supports GitHub Actions for continuous integration.

Workflow file:

```text
.github/workflows/automation.yml
```

---

# Future Enhancements

- Cross-browser execution
- Docker integration
- Jenkins pipeline
- Parallel execution
- Screenshot capture
- Retry analyzer
- Data-driven testing
- ConfigReader implementation
- BrowserStack integration

---

# Author

## Emmanuel  Bore

QA Automation Engineer | SDET

### Skills

- Selenium
- Playwright
- Cypress
- API Testing
- Performance Testing
- CI/CD
- Jenkins
- GitHub Actions
- Docker
- Java
- JavaScript
- Test Automation Framework Design

---

# License

This project is for learning, portfolio, and automation framework demonstration purposes.