# Database Schema Design

## USERS
- id: BIGINT (PK)
- username: VARCHAR(50)
- password: VARCHAR(255)
- role: ENUM('ADMIN', 'DOCTOR', 'PATIENT')

## DOCTORS
- id: BIGINT (PK)
- first_name: VARCHAR(50)
- last_name: VARCHAR(50)
- specialty: VARCHAR(100)
- email: VARCHAR(100)
- phone: VARCHAR(20)

## PATIENTS
- id: BIGINT (PK)
- first_name: VARCHAR(50)
- last_name: VARCHAR(50)
- email: VARCHAR(100)
- phone: VARCHAR(20)

## APPOINTMENT
- id: BIGINT (PK)
- doctor_id: BIGINT (FK -> DOCTORS.id)
- patient_id: BIGINT (FK -> PATIENTS.id)
- appointment_time: DATETIME
- status: VARCHAR(20)
