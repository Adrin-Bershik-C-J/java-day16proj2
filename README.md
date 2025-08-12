# Hostel Management System (Stream Filters Example)

This Spring Boot project demonstrates **Java Stream filtering** in a REST API.  
It provides a **Student API** where you can dynamically filter student data based on various query parameters like ID, name, age, room number, and fee payment status.

---

## 📂 Project Structure

```
Directory structure:
└── adrin-bershik-c-j-java-day16proj2/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── springboot/
    │   │   │           └── day14proj2/
    │   │   │               ├── Day14proj2Application.java
    │   │   │               ├── controller/
    │   │   │               │   └── StudentController.java
    │   │   │               ├── dto/
    │   │   │               │   └── StudentResponseDTO.java
    │   │   │               ├── entity/
    │   │   │               │   ├── Room.java
    │   │   │               │   ├── Student.java
    │   │   │               │   └── Warden.java
    │   │   │               ├── mapper/
    │   │   │               │   └── StudentMapper.java
    │   │   │               ├── repository/
    │   │   │               │   ├── RoomRepository.java
    │   │   │               │   ├── StudentRepository.java
    │   │   │               │   └── WardenRepository.java
    │   │   │               └── service/
    │   │   │                   └── StudentService.java
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    │       └── java/
    │           └── com/
    │               └── springboot/
    │                   └── day14proj2/
    │                       └── Day14proj2ApplicationTests.java
    └── .mvn/
        └── wrapper/
            └── maven-wrapper.properties
```

---

## ⚙️ Technologies Used

- **Java 17+**
- **Spring Boot 3+**
- **Spring Data JPA**
- **H2 Database** (in-memory)
- **MapStruct** (DTO mapping)
- **Lombok** (for boilerplate reduction)
- **Java Streams API** (for filtering)

---

## 🚀 How to Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/<your-repo>/adrin-bershik-c-j-java-day16proj2.git
cd adrin-bershik-c-j-java-day16proj2
