# Rest Assured API Test Lab

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![RestAssured](https://img.shields.io/badge/RestAssured-6DB33F?style=for-the-badge&logo=java&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![Hamcrest](https://img.shields.io/badge/Hamcrest-655c83?style=for-the-badge)
![Jackson](https://img.shields.io/badge/Jackson-ff9933?style=for-the-badge)
![JavaFaker](https://img.shields.io/badge/JavaFaker-3b5b3f?style=for-the-badge)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)

---

## Table of Contents
1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Installation](#installation)
4. [Configuration](#configuration)
5. [Usage](#usage)
6. [Folder Structure](#folder-structure)
7. [Dependencies](#dependencies)
8. [Reporting and Logs](#reporting-and-logs)
9. [HTTP Status Codes](#http-status-codes)
10. [Contributors](#contributors)
11. [License](#license)
12. [Contact](#contact)

---

## Project Overview
The **Rest Assured API Test Lab** is an API testing framework designed to automate the testing of backend services.  
This project uses **Rest Assured, TestNG, Hamcrest, and JavaFaker** to ensure the accuracy and stability of API endpoints.  
It is tailored for educational purposes and testing REST APIs for the **Mersys Campus** application.

---

## Features
- **Automated API Testing** – Supports CRUD operations with `GET`, `POST`, `PUT`, and `DELETE` requests.  
- **Dynamic Data** – Uses JavaFaker to generate random data for testing.  
- **Reusable Components** – Modular design for reusable request and response specifications.  
- **Logging and Reporting** – Logs API requests and responses, with TestNG-generated HTML reports.  
- **Parallel Execution** – Supports concurrent test execution for efficiency.  

---

## Installation
### 1. Clone the Repository
```bash
git clone https://github.com/cihat-kose/restassured-api-test-lab.git
```

### 2. Import the Project (IntelliJ IDEA)
1. **File > New > Project from Version Control**  
2. Enter Repository URL:  
   ```bash
   https://github.com/cihat-kose/restassured-api-test-lab.git
   ```
3. **Maven auto-import** will download dependencies automatically.  

> ⚙️ If dependencies are not downloaded automatically:
```bash
mvn clean install
```

---

### 3. Recommended Plugins (IntelliJ IDEA)
- **TestNG**  
- **Maven Helper**  
- **REST Client**  
- **Lombok** *(Optional if used in the project)*  

---

### 4. Verify Installation
Run the following command to verify that tests execute correctly:  
```bash
mvn test
```

---

## Configuration
### API Endpoint
- **Base URI**: `https://test.mersys.io`  
- **Authentication**: 
```json
{
  "username": "turkeyts",
  "password": "TechnoStudy123",
  "rememberMe": true
}
```
- **Endpoints**:
  - **Create Attestation**: `/school-service/api/attestation`
  - **Update Attestation**: `/school-service/api/attestation`
  - **Delete Attestation**: `/school-service/api/attestation/{id}`

---

## Usage
### Running Tests
To run all tests:  
```bash
mvn clean test
```

Or, right-click on any test file in IntelliJ and select:  
**Run 'ClassName'**

---

## Folder Structure
```plaintext
restassured-api-test-lab/
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── campus/                # Campus API tests
│       │   └── reqresIn/              # Reqres API tests
│       └── resources/
│           └── testng.xml             # TestNG configuration
├── target/                            # Build output
├── images/                            # Project images
│   └── HTTP_Status_Codes.png
├── LICENSE                            # License file (MIT License)
├── pom.xml                            # Maven dependencies
└── README.md                          # Project documentation
```

---

## Dependencies
Managed in `pom.xml`. Key dependencies include:  

- **Rest Assured** – API testing  
- **TestNG** – Test execution  
- **Hamcrest** – Enhanced assertions  
- **Jackson** – JSON parsing  
- **JavaFaker** – Dynamic data generation  

---

## Reporting and Logs
- **HTML Reports** – Available at `target/surefire-reports/`.  
- **Logs** – API requests and responses are logged for debugging.

```bash
cat target/surefire-reports/emailable-report.html
```

---

## HTTP Status Codes
This project commonly encounters a variety of HTTP status codes in responses.  
Below is a summary of some frequently used status codes and their meanings:

![HTTP Status Codes](./images/HTTP_Status_Codes.png)

---

## Contributors
- [cihat-kose](https://github.com/cihat-kose) – **Software Tester**  

---

## License
This project is licensed under the MIT License.  
See the [LICENSE](LICENSE) file for details.  

---

## Contact
For questions, contributions, or issues, please open an issue in the repository.  
---

