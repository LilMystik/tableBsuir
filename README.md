 # BSUIRTableAPI
BSUIRTableAPI is a Java Maven server taht accepts group's id as input and returns JSON object containing information about group's table
# Technologies Used:
1.Java

2.Spring Boot

3.Maven

# Example
```
http://localhost:8080/info?id=250501
```
```json
 "Вторник": [
      {
        "auditories": [
          "512-5 к."
        ],
        "endLessonTime": "11:55",
        "lessonTypeAbbrev": "ЛР",
        "note": null,
        "numSubgroup": 1,
        "startLessonTime": "10:35",
        "studentGroups": [
          {
            "specialityName": "Вычислительные машины, системы и сети",
            "specialityCode": "1-40 02 01",
            "numberOfStudents": 24,
            "name": "250501",
            "educationDegree": 1
          }
        ],
        "subject": "АПК",
        "subjectFullName": "Архитектура персональных компьютеров",
        "weekNumber": [
          1,
          3
        ],
        "employees": [
          {
            "id": 500552,
            "firstName": "Дмитрий",
            "middleName": "Николаевич",
            "lastName": "Одинец",
            "photoLink": "https://iis.bsuir.by/api/v1/employees/photo/500552",
            "degree": "кандидат технических наук",
            "degreeAbbrev": "к.т.н.",
            "rank": "доцент",
            "email": "adzinets@bsuir.by",
            "urlId": "d-odinets",
            "calendarId": "stqgf7btgm46tbr1auc04a6nbk@group.calendar.google.com",
            "jobPositions": null
          }
        ],
        "dateLesson": null,
        "startLessonDate": "13.02.2024",
        "endLessonDate": "04.06.2024",
        "announcement": false,
        "split": false
      },
```
