university Database Design

studentInfo:
id (primary key), name, age, gender, gpa

teacherInfo:
id (primary key), name

==========================================================

Restful API Design

Student CRUD

GET /students: Return all the students in the university
GET /student/{id}: Find student by id
POST /students/add/{id}/{name}/{age}/{gender}/{gpa}: create a new student
PUT /students/update/{id}/{name}/{age}/{gender}/{gpa}: Update the information of a specific student
DELETE /student/{id}: Delete student by id


Teacher CRUD

GET /teachers: Return all the teachers in the university
GET /teachers/{id}: Find teacher by id
POST /teachers/{id}/{name}: Update a new teacher
PUT /teachers/{id}/{name}: Update the information of a specific teacher (with all information)
DELETE /teachers/{id}: Delete teacher by id

