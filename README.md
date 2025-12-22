# 🎓 Education Loan System

Education Loan System is a web-based application developed using **Java, Spring Boot, JSP, and MySQL**.  
This is a **team project**, and all development follows a controlled Git workflow managed by the **Team Lead**.

---

## 🧑‍💻 Tech Stack

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA (Hibernate)
- JSP (Server-side rendering)
- MySQL
- Maven
- Git & GitHub
- Embedded Tomcat

---

## 🚀 How to Clone the Project

```bash
git clone https://github.com/<your-github-username>/education-loan-system.git
cd education-loan-system


# 1️⃣ Clone the project
git clone https://github.com/<your-github-username>/education-loan-system.git
cd education-loan-system


# 2️⃣ Verify Java version (must be 17 or above)
java -version


# 3️⃣ Login to MySQL
mysql -u root -p


# 4️⃣ Create database
CREATE DATABASE education_loan_dev;
EXIT;


# 5️⃣ Create local application.properties from example
cp src/main/resources/application.properties.example \
   src/main/resources/application.properties


# 6️⃣ Edit database credentials
nano src/main/resources/application.properties


# ---- Inside the file, update these values ----
# spring.datasource.url=jdbc:mysql://localhost:3306/education_loan_dev
# spring.datasource.username=YOUR_DB_USERNAME
# spring.datasource.password=YOUR_DB_PASSWORD
#
# Save and exit:
# CTRL + O → Enter → CTRL + X


# 7️⃣ Build the project
./mvnw clean install


# 8️⃣ Run the application
./mvnw spring-boot:run

```

## 🌱 Git Workflow (MANDATORY FOR TEAM)
# Create your own feature branch

git checkout -b feature-your-module-name

# Example
git checkout -b feature-student-module

## 🛠️ Commit & Push Your Work

git add .
git commit -m "Clear description of your changes"
git push origin feature-your-module-name


## “Clone → setup DB → run app → create feature branch → code → push branch.”
