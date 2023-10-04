<p><b>For user (Get)</b></p>

```
http://localhost:8080/registerUser/John/john@gmail.com
```

<p><b>For user with Request Body (Post)</b></p>

```
http://localhost:8080/registerUserBody/
```

JSON:
```
{
 "name": "john", 
 "email": "john@gmail.com"
}
```
<p><b>For Library</b></p>
<p><b>To add a book (Post)</b></p>

``` 
http://localhost:8080/addbook
```

JSON:
```
{
  "title": "Sample Book",
  "author": "John Doe",
  "isbn": "1234567890", 
  "publishedYear": 2023
}
```

<p><b>Retreive a list of books (Get)</b></p>

```
http://localhost:8080/getbooks
```