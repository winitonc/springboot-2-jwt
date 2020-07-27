# Rest API by Spring boot 2 + JWT example project

Create simple REST APIs authentication by JWT and manage user in database using,
- JAVA 11
- MYSQL
- Maven
- Spring boot 2
  - spring-boot-starter-web
  - spring-boot-starter-security
  - spring-boot-starter-data-jpa
- Other libraries
  - mysql-connector-java
  - jjwt - json web token
  - jakarta.xml.bind-api - in JAVA 11 `java.xml.bind (JAXB)` has been removed.


# APIs
### /register
API to register user. Once registered then, use `/authenticate` API to create JWT token.

Example request:
```
curl -X POST 'http://localhost:8080/register' -H 'Content-Type: application/json' --data-raw '{
    "username": "winitonc",
    "password": "password"
}'
```

Example response:
```
{
    "id": 1,
    "username": "winitonc"
}
```


### /authenticate
API to authenticate user. This api return JWT token then, use token on `/hello` API.

Example request:
```
curl -X POST 'http://localhost:8080/authenticate' -H 'Content-Type: application/json' --data-raw '{
    "username": "winitonc",
    "password": "password"
}'
```
Example response:
```
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ3aW5pdG9uYyIsImV4cCI6MTU5NTg2MjgyNywiaWF0IjoxNTk1ODQ0ODI3fQ.D0RyTbO5ssFAeH-SPJDh5icDZKBPNK6Q9pqKdIhXPX6o3sEgexo0fmQmD5DTeLo4gGSrqMwj-3dHlWIGPPX3QA"
}
```

### /hello
API to test authenication with bareer JWT token.

Example request with 401 response:
```
curl -X GET 'http://localhost:8080/hello'
```

Example request with 200 response:
```
curl -X GET 'http://localhost:8080/hello' -H 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ3aW5pdG9uYyIsImV4cCI6MTU5NTg2MjgyNywiaWF0IjoxNTk1ODQ0ODI3fQ.D0RyTbO5ssFAeH-SPJDh5icDZKBPNK6Q9pqKdIhXPX6o3sEgexo0fmQmD5DTeLo4gGSrqMwj-3dHlWIGPPX3QA'
```