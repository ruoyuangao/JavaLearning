university Database Design

studentInfo:
id (primary key), name, age, gender, gpa

teacherInfo:
id (primary key), name, work_experience

==========================================================

Restful API Design

Student CRUD

GET /students: Return all the students in the university
GET /student/{id}: Find student by id
POST /students: Update a new student
PUT /students/{id}: Update the information of a specific student (with all information of the student)
PATCH /students/{id}: Update the information of a specific student (with part information of the student)
DELETE /student/{id}: Delete student by id


Teacher CRUD

GET /teachers: Return all the teachers in the university
GET /teachers/{id}: Find teacher by id
POST /teachers: Update a new teacher
PUT /teachers/{id}: Update the information of a specific teacher (with all information)
PATCH /teachers/{id}: Update the information of a specific teacher (with part information)
DELETE /teachers/{id}: Delete teacher by id

